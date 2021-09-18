package com.constructores.repository.impl;

import java.util.List;


import org.springframework.stereotype.Repository;


import com.constructores.entities.TipoConstruccion;
import com.constructores.repository.TipoConstruccionRepository;

@Repository
public class TipoConstruccionRepositoryImpl implements TipoConstruccionRepository {

	@Override
	public List<TipoConstruccion> guardarTipoconstruccion(TipoConstruccion tipoconstruccion) {
		System.out.println("getCoordenadaX:::"+tipoconstruccion.getCoordenadaX());
		return null;
	}
	
	
    
    

}
