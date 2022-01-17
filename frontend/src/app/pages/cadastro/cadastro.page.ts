import { Component, OnInit, ViewChild } from '@angular/core';
import { IonSlides, LoadingController, ToastController } from '@ionic/angular';
import { User } from 'src/app/interfaces/user';
import { AuthService } from 'src/app/services/auth.service';
import { AngularFirestore } from '@angular/fire/compat/firestore';
import { AngularFireAuth } from '@angular/fire/compat/auth';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.page.html',
  styleUrls: ['./cadastro.page.scss'],
})
export class CadastroPage implements OnInit {
  @ViewChild(IonSlides) slides: IonSlides;
  public userLogin: User = {};
  public userRegister: User = {};
  private loading: any;

  constructor(
    private loadingCtrl: LoadingController,
    private toastCtrl: ToastController,
    private authService: AuthService,
    private afa: AngularFireAuth,
    private afs: AngularFirestore
  ) { }

  ngOnInit() {
  }

  segmentChanged(event: any) {
    if (event.detail.value === 'candidato') {
      this.slides.slidePrev();
    } else {
      this.slides.slideNext();
    }
  }

  async register() {
    await this.presentLoading();

    try {
      const newUser = await this.authService.register(this.userRegister);
      await this.afs.collection('user').doc(newUser.user.uid).set(this.userRegister);
    } catch (error) {
      let menssage: string;

      switch(error.code) {
        case 'auth/email-already-in-use':
        menssage = 'E-mail já cadastrado!';
        break;

        case 'auth/invalid-email':
        menssage = 'E-mail inválido!';
        break;

        case 'auth/cpf-already-in-use':
        menssage = 'CPF já cadastrado!';
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

  async registerEmpresa() {
    await this.presentLoading();

    try {
      const newUser = await this.authService.register(this.userRegister);
      await this.afs.collection('userEmpresa').doc(newUser.user.uid).set(this.userRegister);
    } catch (error) {
      let menssage: string;

      switch(error.code) {
        case 'auth/email-already-in-use':
        menssage = 'E-mail já cadastrado!';
        break;

        case 'auth/invalid-email':
        menssage = 'E-mail inválido!';
        break;

        case 'auth/cpf-already-in-use':
        menssage = 'CPF já cadastrado!';
        break;

      }

      this.presentToast(menssage);
    } finally {
      this.loading.dismiss();
    }
  }

  
}