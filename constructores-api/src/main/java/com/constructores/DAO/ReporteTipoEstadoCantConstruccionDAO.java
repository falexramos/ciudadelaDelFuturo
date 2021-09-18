package com.constructores.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.ReporteTipoEstadoCantConstruccion;

public interface ReporteTipoEstadoCantConstruccionDAO extends JpaRepository<ReporteTipoEstadoCantConstruccion, String> {

String consultaTipoEstadoCantConstruccion = "select c.tipo_construccion,e.estado_construccion, count(c.idtipo) cantidad\r\n" + 
		" from tipo_construccion c\r\n" + 
		"   inner join estado e on (e.idestado=c.estado)\r\n" + 
		"    where c.estado <> 4\r\n" + 
		"    group by e.estado_construccion ";
	
	@Query(value=consultaTipoEstadoCantConstruccion, nativeQuery = true)
	public List<ReporteTipoEstadoCantConstruccion>  reporteTipoEstadoCantConstruccion( );
	
	
}
