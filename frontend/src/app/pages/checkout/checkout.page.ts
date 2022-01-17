import { Component, OnInit } from '@angular/core';
import { AlertController, NavController } from '@ionic/angular';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.page.html',
  styleUrls: ['./checkout.page.scss'],
})
export class CheckoutPage implements OnInit {

  constructor(
    private alertCtrl:AlertController,private nav:NavController
    ) { }

  ngOnInit() {
  }

  ShowPage(){
    this.nav.navigateBack("pages/assinaturas")
  }

  async ShowDebito(){
    const myAlert = await this.alertCtrl.create({
      header: 'DADOS DO PAGAMENTO',
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
  async ShowCredito(){
    const myAlert = await this.alertCtrl.create({
      header: 'DADOS DO PAGAMENTO',
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
          name:'codigo',
          placeholder:'Código de segurança',
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
  async ShowPix(){
    const myAlert = await this.alertCtrl.create({
      header: 'DADOS DO PAGAMENTO',
      subHeader: 'CHAVE PIX',
      message:'21998244729',
      

      buttons:[
        {
          text:'Cancelar',
          handler: ()=>{console.log("Cancelou o pagamento")}
        },
        {
          text:'Confirmar',
          handler: ()=>{console.log("Confirmou o pagamento")},


        },
        

      ]

    });

    myAlert.present();
  }

}