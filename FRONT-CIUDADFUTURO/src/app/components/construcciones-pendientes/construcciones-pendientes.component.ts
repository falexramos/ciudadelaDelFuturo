import { Component, OnInit } from '@angular/core';
import { ConstrutionRequestService } from 'src/app/services/constrution-request.service';

@Component({
  selector: 'app-construcciones-pendientes',
  templateUrl: './construcciones-pendientes.component.html',
  styleUrls: ['./construcciones-pendientes.component.css']
})
export class ConstruccionesPendientesComponent implements OnInit {
  construccionPendiente=[]
  constructor(private serviceConstruction: ConstrutionRequestService) { }

  ngOnInit(): void {
    this.serviceConstruction.verConstruccionesPendientes().subscribe((data=>{
      this.construccionPendiente=data;
    }))
  }

}
