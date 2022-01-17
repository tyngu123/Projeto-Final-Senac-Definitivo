import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss'],
})
export class AppComponent {
  public appPages = [
    { title: 'Início', url: 'telainicial', icon: 'navigate' },
    { title: 'Perfil', url: 'pages/perfil', icon: 'person-circle'},
    { title: 'Cadastro', url: 'pages/cadastro', icon: 'person-add' },
    { title: 'Entrar', url: 'pages/login', icon: 'enter' },
    { title: 'Assinaturas', url: 'pages/assinaturas', icon: 'cart' },
    { title: 'Configurações', url: 'pages/settings', icon: 'settings' },
    { title: 'Logout', url: 'pages/logout', icon: 'log-out' },
    { title: 'Cadastro de vagas', url: 'pages/cadastro-vagas', icon: 'add-circle'},
    { title: 'Gerenciamento de vagas', url: 'pages/vagas-ativas', icon: 'pencil'},

  ];
  public labels= ['Rio de Janeiro', 'São Paulo', 'Belo Horizonte', 'Fortaleza', 'Santa Catarina', 'Brasília'];
  constructor() {}
}
