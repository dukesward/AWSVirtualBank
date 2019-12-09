import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { BankingComponent } from './banking/banking.component';
import { PrelophomeComponent } from './prelophome/prelophome.component';
import { ErrorComponent } from './error/error.component';

import { Routes, RouterModule } from '@angular/router';
import { PrelopinputComponent } from './prelopinput/prelopinput.component';
import { PrelopconfirmComponent } from './prelopconfirm/prelopconfirm.component';
import { PrelopsuccessComponent } from './prelopsuccess/prelopsuccess.component';

import { HttpClientModule } from "@angular/common/http";

const routes: Routes = [{
  path: "", redirectTo: "prelophome", pathMatch: "full"
}, {
  path: "prelophome", component: PrelophomeComponent
}, {
  path: "prelophome/prelopinput", component: PrelopinputComponent
}, {
  path: "prelophome/prelopconfirm", component: PrelopconfirmComponent
}, {
  path: "prelophome/prelopsuccess", component: PrelopsuccessComponent
}, {
  path: "error", component: ErrorComponent
}];

@NgModule({
  declarations: [
    AppComponent,
    BankingComponent,
    PrelophomeComponent,
    ErrorComponent,
    PrelopinputComponent,
    PrelopconfirmComponent,
    PrelopsuccessComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
