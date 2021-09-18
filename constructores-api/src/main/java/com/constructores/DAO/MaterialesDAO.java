package com.constructores.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.Materiales;

public interface MaterialesDAO extends JpaRepository<Materiales, String> {

String consulta = "select construccion, cemento, grava, arena, madera, abobe from materiales where construccion=:construccion";
	
	@Query(value=consulta, nativeQuery = true)
	public List<Materiales> buscarMaterial(String construccion );
}
