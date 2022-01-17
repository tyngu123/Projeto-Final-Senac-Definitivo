import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DetalhesVagaPage } from './detalhes-vaga.page';

const routes: Routes = [
  {
    path: '',
    component: DetalhesVagaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DetalhesVagaPageRoutingModule {}
