import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-assinaturas',
  templateUrl: './assinaturas.page.html',
  styleUrls: ['./assinaturas.page.scss'],
})
export class AssinaturasPage implements OnInit {

  constructor(private nav:NavController) { }

  ngOnInit() {
  }


  ShowPage(){
    this.nav.navigateBack("telainicial")
  }

  ShowPremium(){
    this.nav.navigateBack("pages/checkout")
  }
  ShowEmpresarial(){
    this.nav.navigateBack("pages/checkout")
  }
}
