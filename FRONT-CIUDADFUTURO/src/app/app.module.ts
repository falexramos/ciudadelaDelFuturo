import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddConstrutionRequestComponent } from './components/add-constrution-request/add-constrution-request.component';
import { UpdateConstrutionComponent } from './components/update-constrution/update-constrution.component';
import { ListConstrutionComponent } from './components/list-constrution/list-constrution.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { FechasConstrucionComponent } from './components/fechas-construcion/fechas-construcion.component';
import { ConstruccionesPendientesComponent } from './components/construcciones-pendientes/construcciones-pendientes.component';



@NgModule({
  declarations: [
    AppComponent,
    AddConstrutionRequestComponent,
    UpdateConstrutionComponent,
    ListConstrutionComponent,
    FechasConstrucionComponent,
    ConstruccionesPendientesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    ReactiveFormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
