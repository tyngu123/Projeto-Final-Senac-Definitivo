import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './guards/auth.guard';
import { LoginGuard } from './guards/login.guard';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'telainicial',
    pathMatch: 'full'
  },
  {
    path: 'telainicial',
    loadChildren: () => import('./pages/telainicial/telainicial.module').then( m => m.TelainicialPageModule)
  },
  {
    path: 'pages/login',
    loadChildren: () => import('./pages/login/login.module').then( m => m.LoginPageModule),
    
  },
  {
    path: 'pages/assinaturas',
    loadChildren: () => import('./pages/assinaturas/assinaturas.module').then( m => m.AssinaturasPageModule),
    
  },
  {
    path: 'pages/settings',
    loadChildren: () => import('./pages/settings/settings.module').then( m => m.SettingsPageModule),
  },
  {
    path: 'pages/logout',
    loadChildren: () => import('./pages/logout/logout.module').then( m => m.LogoutPageModule),
    
  },
  
  {
    path: 'pages/checkout',
    loadChildren: () => import('./pages/checkout/checkout.module').then( m => m.CheckoutPageModule),
    
  },
  {
    path: 'pages/vagas-ativas',
    loadChildren: () => import('./pages/vagas-ativas/vagas-ativas.module').then( m => m.VagasAtivasPageModule),
    
  },
  {
    path: 'pages/detalhes-vaga',
    loadChildren: () => import('./pages/detalhes-vaga/detalhes-vaga.module').then( m => m.DetalhesVagaPageModule)
  },
  {
    path: 'pages/detalhes-vaga/:id',
    loadChildren: () => import('./pages/detalhes-vaga/detalhes-vaga.module').then( m => m.DetalhesVagaPageModule)
  },
  {
    path: 'pages/perfil',
    loadChildren: () => import('./pages/perfil/perfil.module').then( m => m.PerfilPageModule)
  },
  {
    path: 'pages/user',
    loadChildren: () => import('./pages/user/user.module').then( m => m.UserPageModule),
    
  },
  {
    path: 'pages/vagas',
    loadChildren: () => import('./pages/vagas/vagas.module').then( m => m.VagasPageModule),
    
  },
  {
    path: 'pages/vagas/:id',
    loadChildren: () => import('./pages/vagas/vagas.module').then( m => m.VagasPageModule),
  
  },


];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})

export class AppRoutingModule {}

