import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, observable } from 'rxjs';
import { Construction } from './construction';


@Injectable({
  providedIn: 'root'
})
export class ConstrutionRequestService {
env:String='http://localhost:8080/';
  constructor( private clientHttp:HttpClient) { }


  solictudConstruccion(dataConstruction:Construction):Observable<any>{
    let options= {
      header: new HttpHeaders({
        'Content-type':'application/json'
      }),
      body:dataConstruction
    }
    return this.clientHttp.post<any>(this.env+'registrar/solicitudConstruccion',dataConstruction);

  }

  verFechasProyecto():Observable<any>{
    return this.clientHttp.get<any>(this.env +'/solicitudes/verFechasProyecto');
  }

  verConstruccionesXTipo():Observable<any>{
    return this.clientHttp.get<any>(this.env + '/solicitudes/verConstruccionesTipo')
  }

  verConstruccionesPendientes():Observable<any>{
    return this.clientHttp.get<any>(this.env + '/solicitudes/verConstruccionesPendientes')
  }
}
