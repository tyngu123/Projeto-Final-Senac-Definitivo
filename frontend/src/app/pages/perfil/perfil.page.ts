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
          placeholder:'Nome completo',

        },

        {
           name:'data',
           placeholder:'Data de nascimento',

        },
        {
         
          name:'email',
          placeholder:'Email',
          type:'email',

       },
       {
        name:'cpf',
        placeholder:'CPF',
        type:'number',
     },
     {
      name:'endereco',
      placeholder:'Endereço',
      },
      
      {
        name:'cep',
        placeholder:'CEP',
        type:'number',
      },
      
      {
        name:'municipio',
        placeholder:'Município',
      },
      
      {
        name:'estado',
        placeholder:'Estado',
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
