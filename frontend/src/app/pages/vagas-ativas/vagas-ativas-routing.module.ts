import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { VagasAtivasPage } from './vagas-ativas.page';

const routes: Routes = [
  {
    path: '',
    component: VagasAtivasPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class VagasAtivasPageRoutingModule {}
