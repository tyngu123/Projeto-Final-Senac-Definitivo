import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { VagasAtivasPageRoutingModule } from './vagas-ativas-routing.module';

import { VagasAtivasPage } from './vagas-ativas.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    VagasAtivasPageRoutingModule
  ],
  declarations: [VagasAtivasPage]
})
export class VagasAtivasPageModule {}
