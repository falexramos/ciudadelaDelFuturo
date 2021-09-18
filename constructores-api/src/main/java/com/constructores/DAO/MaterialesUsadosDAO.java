package com.constructores.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.MaterialesUsados;

public interface MaterialesUsadosDAO extends JpaRepository<MaterialesUsados, Integer> {
	
String consulta = "SELECT id, SUM(cemento) as cemento, SUM(grava) as grava, SUM(arena) as arena, SUM(madera) as madera, SUM(adobe) as adobe, tipo_construccion FROM ciu_futuro.materiales_usados";
	
	@Query(value=consulta, nativeQuery = true)	
	public List<MaterialesUsados> sumaMateriales();
	
}
