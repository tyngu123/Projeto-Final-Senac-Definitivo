import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DetalhesVagaPageRoutingModule } from './detalhes-vaga-routing.module';

import { DetalhesVagaPage } from './detalhes-vaga.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DetalhesVagaPageRoutingModule
  ],
  declarations: [DetalhesVagaPage]
})
export class DetalhesVagaPageModule {}
