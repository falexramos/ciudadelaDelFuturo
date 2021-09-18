package com.constructores.repository;

import java.util.List;

import com.constructores.entities.TipoConstruccion;

public interface TipoConstruccionRepository {
	
	List<TipoConstruccion>  guardarTipoconstruccion(TipoConstruccion tipoconstruccion);
}
