package com.constructores.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constructores.entities.TipoConstruccion;
import com.constructores.services.RegistrarSolicitudServices;
import com.constructores.util.TipoConstruccionResultDTO;


@RestController
@RequestMapping("registrar")

public class RegistrarSolicitud {

	private RegistrarSolicitudServices registrarSolicitudServices; 
	

	
	@Autowired
	public RegistrarSolicitud(RegistrarSolicitudServices registrarSolicitudServices) {
		this.registrarSolicitudServices = registrarSolicitudServices;
	}

	@PostMapping(value="solicitudConstruccion")
	public TipoConstruccionResultDTO registrarSolicitud(@RequestBody TipoConstruccion tipoConstruccion){
		TipoConstruccionResultDTO  resultado=registrarSolicitudServices.registrarSolicitudConstruccion(tipoConstruccion);			
		
		return resultado; 
	}




}
