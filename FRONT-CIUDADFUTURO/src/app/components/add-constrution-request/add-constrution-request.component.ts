import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { ConstrutionRequestService } from 'src/app/services/constrution-request.service';


@Component({
  selector: 'app-add-constrution-request',
  templateUrl: './add-constrution-request.component.html',
  styleUrls: ['./add-constrution-request.component.css']
})
export class AddConstrutionRequestComponent implements OnInit {
  formGroupConstrution:FormGroup;
  datos:any;
  mensaje:string;
  mostrarMensaje:number;
  constructor(
    public formBuilder:FormBuilder,
    private serviceConstruction:ConstrutionRequestService,
    private router:Router) {
    
    this.formGroupConstrution=this.formBuilder.group({
      tipoConstruccion: [''],
      coordenadaX:[''],
      coordenadaY:[''],
      fechaInicio:[''],
      fechafin:[''],
      estado:['4'],
      materialesConstruccion:['']
    });
   this.mensaje="";
   this.mostrarMensaje=0;  
  }

  ngOnInit(): void {
    
  }

  enviarDatos():any{
    this.formGroupConstrution.patchValue({
      materialesConstruccion:  this.formGroupConstrution.controls['tipoConstruccion'].value 
   });
   
   this.serviceConstruction.solictudConstruccion(this.formGroupConstrution.value).subscribe(
     (data) => {
        this.datos=JSON.stringify(data);
        this.mensaje=data.mensaje;
        this.mostrarMensaje=1;
      //  this.router.navigateByUrl('/construccion-tipo')
     }
   );

  }


}
