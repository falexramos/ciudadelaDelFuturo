package com.constructores.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.ReportesConstruccionesPendientes;

public interface ReportesConstruccionesPendientesDAO extends JpaRepository<ReportesConstruccionesPendientes, Integer>{

	
	String consultaConstruccionPendientes = "select c.idtipo as id,c.tipo_construccion,e.estado_construccion,c.coordenada_X, c.coordenada_Y, c.fecha_inicio, c.fecha_fin\r\n" + 
			"from tipo_construccion c\r\n" + 
			" inner join estado e on (e.idestado=c.estado)\r\n" + 
			" where c.estado=5";
	
	@Query(value=consultaConstruccionPendientes, nativeQuery = true)
	public List<ReportesConstruccionesPendientes> consultarConstruccionesPendientes( );
	
	
}
