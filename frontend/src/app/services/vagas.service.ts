import { Injectable } from '@angular/core';
import { AngularFirestore, AngularFirestoreCollection } from '@angular/fire/compat/firestore';
import { Vagas } from '../interfaces/vagas';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class VagasService {
  private vagasCollection: AngularFirestoreCollection<Vagas>;

  constructor(private afs: AngularFirestore) { 
    this.vagasCollection = this.afs.collection<Vagas>('vagas');
  }

  getVagas() {
    return this.vagasCollection.snapshotChanges().pipe(
      map(actions => {
        return actions.map(a => {
          const data = a.payload.doc.data();
          const id = a.payload.doc.id;

          return { id, ...data };
        });
      })
    );

  }

  addVaga(vagas: Vagas) {
    return this.vagasCollection.add(vagas);
  }

  getVaga(id: string) {
    return this.vagasCollection.doc<Vagas>(id).valueChanges();
  }

  updateVaga(id: string, vagas: Vagas ) {
    return this.vagasCollection.doc<Vagas>(id).update(vagas);
  }

  deleteVaga(id: string) {
    return this.vagasCollection.doc(id).delete();
  }
}
