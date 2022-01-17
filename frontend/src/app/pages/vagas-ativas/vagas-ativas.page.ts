import { Component, OnInit } from '@angular/core';
import { ToastController } from '@ionic/angular';
import { Subscription } from 'rxjs';
import { Vagas } from 'src/app/interfaces/vagas';
import { VagasService } from 'src/app/services/vagas.service';

@Component({
  selector: 'app-vagas-ativas',
  templateUrl: './vagas-ativas.page.html',
  styleUrls: ['./vagas-ativas.page.scss'],
})
export class VagasAtivasPage implements OnInit {

  public vagas = new Array<Vagas>();
  private vagasSubscription: Subscription;
  
  constructor(private vagasService: VagasService,private toastCtrl: ToastController) {
    this.vagasSubscription = this.vagasService.getVagas().subscribe(data => {
      this.vagas = data;
    });
   }

  ngOnInit() { }

  ngOnDestroy() {
    this.vagasSubscription.unsubscribe();
  }

  async deleteVaga(id: string) {
    try {
      this.vagasService.deleteVaga(id);
    } catch (error) {
      this.presentToast('Erro ao tentar deletar');
    }
  }

  async presentToast(message: string) {
    const toast = await this.toastCtrl.create({ message, duration: 2000 });
    toast.present();
  }

}
