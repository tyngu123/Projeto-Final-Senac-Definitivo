import { Component, OnInit } from '@angular/core';
import { AlertController, NavController } from '@ionic/angular';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.page.html',
  styleUrls: ['./perfil.page.scss'],
})
export class PerfilPage implements OnInit {

  constructor(
    private nav:NavController,
    private alertCtrl:AlertController
  ) { }

  ngOnInit() {
  }

  ShowPage(){
    this.nav.navigateBack("telainicial")
  }
  async ShowDados(){
    const myAlert = await this.alertCtrl.create({
      header: 'REDEFINIR DADOS',
     // subHeader: 'SUB HEADER',
     // message:'MESSAGE',
      
      inputs:[
        {
          name:'nome',
          placeholder:'Nome do titular',

        },

        {
           name:'cartao',
           placeholder:'Número do cartão',
           type:'password',

        },
        {
         
          name:'email',
          placeholder:'Email',
          type:'email',

       },
       {
        name:'senha',
        placeholder:'Senha',
        type:'password',
     },
    ],

      buttons:[
        {
          text:'Cancelar',
          handler: ()=>{console.log("Cancelou o pagamento")}
        },
        {
          text:'Confirmar',
          handler: ()=>{console.log("Confirmou o pagamento")}
        },

      ]

    });

    myAlert.present();
  }
}
