import { Component, OnInit } from '@angular/core';
import { Vagas } from 'src/app/interfaces/vagas';
//import { VagasService } from 'src/app/services/vagas.service';
import { Subscription } from 'rxjs';
import { ToastController } from '@ionic/angular';

@Component({
  selector: 'app-detalhes-vaga',
  templateUrl: './detalhes-vaga.page.html',
  styleUrls: ['./detalhes-vaga.page.scss'],
})
export class DetalhesVagaPage implements OnInit {
  public vagas = new Array<Vagas>();
  private vagasSubscription: Subscription;
  
  //constructor(private vagasService: VagasService,private toastCtrl: ToastController) {
   // this.vagasSubscription = this.vagasService.getVagas().subscribe(data => {
   //   this.vagas = data;
   // });
  // }

  ngOnInit() {
  }

}
