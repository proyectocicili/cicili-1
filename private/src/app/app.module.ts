import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { RegisterComponent } from './register/register.component';
import { SplashscreenComponent } from './splashscreen/splashscreen.component'

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    LoginComponent,
    ForgotPasswordComponent,
    RegisterComponent,
    SplashscreenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
