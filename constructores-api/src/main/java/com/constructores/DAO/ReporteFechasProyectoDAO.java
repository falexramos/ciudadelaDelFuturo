package com.constructores.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.ReporteFechasProyecto;

public interface ReporteFechasProyectoDAO extends JpaRepository<ReporteFechasProyecto, Integer> {

	String consultaFechaProyecto = "select idtipo as id, (fecha_inicio) as fecha_inicio,max(fecha_fin) as fecha_fin FROM tipo_construccion";
	
	@Query(value=consultaFechaProyecto, nativeQuery = true)
	public List<ReporteFechasProyecto>  fechasProyecto( );
	

}
