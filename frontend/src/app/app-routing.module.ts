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
    canActivate: [LoginGuard]
  },
  {
    path: 'pages/assinaturas',
    loadChildren: () => import('./pages/assinaturas/assinaturas.module').then( m => m.AssinaturasPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'pages/settings',
    loadChildren: () => import('./pages/settings/settings.module').then( m => m.SettingsPageModule),
  },
  {
    path: 'pages/logout',
    loadChildren: () => import('./pages/logout/logout.module').then( m => m.LogoutPageModule),
    canActivate: [AuthGuard]
  },
  
  {
    path: 'pages/checkout',
    loadChildren: () => import('./pages/checkout/checkout.module').then( m => m.CheckoutPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'pages/vagas-ativas',
    loadChildren: () => import('./pages/vagas-ativas/vagas-ativas.module').then( m => m.VagasAtivasPageModule),
    canActivate: [AuthGuard]
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
    path: 'pages/admin',
    loadChildren: () => import('./pages/admin/admin.module').then( m => m.AdminPageModule)
  },
  {
    path: 'pages/user',
    loadChildren: () => import('./pages/user/user.module').then( m => m.UserPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'pages/vagas',
    loadChildren: () => import('./pages/vagas/vagas.module').then( m => m.VagasPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'pages/vagas/:id',
    loadChildren: () => import('./pages/vagas/vagas.module').then( m => m.VagasPageModule),
    canActivate: [AuthGuard]
  },


];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})

export class AppRoutingModule {}

