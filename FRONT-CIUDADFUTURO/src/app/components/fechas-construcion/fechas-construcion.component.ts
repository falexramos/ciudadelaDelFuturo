import { Component, OnInit } from '@angular/core';
import { ConstrutionRequestService } from 'src/app/services/constrution-request.service';

@Component({
  selector: 'app-fechas-construcion',
  templateUrl: './fechas-construcion.component.html',
  styleUrls: ['./fechas-construcion.component.css']
})
export class FechasConstrucionComponent implements OnInit {
  fechasProyecto=[];
  constructor(
    private constructionService:ConstrutionRequestService
  ) { }

  ngOnInit(): void {
    this.constructionService.verFechasProyecto().subscribe(data=>{
      
      this.fechasProyecto=data;
      
      
  });

  }

}
