import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddConstrutionRequestComponent } from './components/add-constrution-request/add-constrution-request.component';
import { UpdateConstrutionComponent } from './components/update-constrution/update-constrution.component';
import { ListConstrutionComponent } from './components/list-constrution/list-constrution.component';
import { FechasConstrucionComponent } from './components/fechas-construcion/fechas-construcion.component';
import { ConstruccionesPendientesComponent } from './components/construcciones-pendientes/construcciones-pendientes.component';

const routes: Routes = [
  {path:'',pathMatch:'full',redirectTo:'solicitud-construccion'},
  {path:'solicitud-construccion',component:AddConstrutionRequestComponent},
  {path:'construccion-tipo',component:ListConstrutionComponent},
  {path:'editar-construccion/:id',component:UpdateConstrutionComponent},
  {path:'fechas-proyecto',component:FechasConstrucionComponent},
  {path:'construccion-pendiente',component: ConstruccionesPendientesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
