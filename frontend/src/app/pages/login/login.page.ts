import { Component, OnInit } from '@angular/core';
import { LoadingController, ToastController } from '@ionic/angular';
import { User } from 'src/app/interfaces/user';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  //public userLogin: User = {};
  //public userRegister: User = {};
  private loading: any;
  
  constructor(
    private loadingCtrl: LoadingController,
    private toastCtrl: ToastController,
    private authService: AuthService
  ) { }

  ngOnInit() {
  }

  async login() {
    await this.presentLoading();

    try {
     // await this.authService.login(this.userLogin);
    } catch (error) {
      let menssage: string;

      switch(error.code) {
        case 'auth/invalid-email':
        menssage = 'E-mail ou senha incorretas!';
        break;

        case 'auth/wrong-password':
        menssage = 'E-mail ou senha incorretas!';
        break;
      }

      this.presentToast(menssage);
    } finally {
      this.loading.dismiss();
    }
  }

  async presentLoading() {
    this.loading = await this.loadingCtrl.create({ message: 'Aguarde...' });
    return this.loading.present();
  }

  async presentToast(message: string) {
    const toast = await this.toastCtrl.create({ message, duration: 2000 });
    toast.present();
  }

}
