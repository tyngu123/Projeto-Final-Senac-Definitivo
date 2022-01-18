import { Component, OnInit } from '@angular/core';
import { AlertController, ToastController } from '@ionic/angular';
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
  
  constructor(private vagasService: VagasService,private toastCtrl: ToastController,
    private alertCtrl:AlertController) {
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

  async ShowEditar(){
    const myAlert = await this.alertCtrl.create({
      header: 'EDITAR',
     // subHeader: 'SUB HEADER',
     // message:'MESSAGE',
      
      inputs:[
        {
          name:'nome',
          placeholder:'Vaga de trabalho',

        },

        {
           name:'estado',
           placeholder:'Estado',
           type:'text',

        },
        {
         
          name:'jornada',
          placeholder:'Jornada de trabalho',
          type:'text',

       },
       {
        name:'salario',
        placeholder:'Salário',
        type:'number',
     },
    ],

      buttons:[
        {
          text:'Cancelar',
          handler: ()=>{console.log("Não editou os dados")}
        },
        {
          text:'Confirmar',
          handler: ()=>{console.log("Dados editados")}
        },

      ]

    });

    myAlert.present();
  }

}