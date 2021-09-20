import { Component, OnInit } from '@angular/core';
import { ConstrutionRequestService } from 'src/app/services/constrution-request.service';


@Component({
  selector: 'app-list-constrution',
  templateUrl: './list-constrution.component.html',
  styleUrls: ['./list-constrution.component.css']
})
export class ListConstrutionComponent implements OnInit {
  construccionTipo:any;
  constructor(
    private constructionService:ConstrutionRequestService
  ) { }

  ngOnInit(): void {
    this.constructionService.verConstruccionesXTipo().subscribe(data=>{
      
      this.construccionTipo=data;
  });
  }

}
