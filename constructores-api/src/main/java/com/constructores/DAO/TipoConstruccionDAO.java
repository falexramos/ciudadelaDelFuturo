package com.constructores.DAO;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.constructores.entities.TipoConstruccion;

public interface TipoConstruccionDAO extends JpaRepository<TipoConstruccion, Integer> {

	String consulta = "SELECT * FROM tipo_construccion tc where tc.coordenada_X = :x and tc.coordenada_Y = :y";
	
	@Query(value=consulta, nativeQuery = true)
	public List<TipoConstruccion> getCoordenadas(Integer x,Integer y);
	
	String consultaMayorFecha = "SELECT fecha_fin FROM tipo_construccion  order by 1 desc limit 1";
	
	@Query(value=consultaMayorFecha, nativeQuery = true)
	public Date consultaMayorFecha ();
	
	
	String consultaMayorFechaInicio = "select max(tcc.fecha_inicio) as fecha_inicio  from tipo_construccion tcc";
	
	@Query(value=consultaMayorFechaInicio, nativeQuery = true)
	public Date consultaMayorFechaInicio ();
	
	String actualizaEstadosFinalizada="SET SQL_SAFE_UPDATES=0;\r\n" + 
			"update tipo_construccion tc\r\n" + 
			"set tc.estado = 3\r\n" + 
			" where tc.fecha_fin < date(:fecha)\r\n" + 
			" and tc.tipo_construccion <> 'INICIO_OBRA' ;\r\n" + 
			"SET SQL_SAFE_UPDATES=1";
	
	
	@Query(value=actualizaEstadosFinalizada, nativeQuery = true)
	public void actualizaEstadosFinalizada (Date fecha);
	
	String ultimaConstruccionRegistro="SELECT idtipo, tipo_construccion, coordenada_X, coordenada_Y, fecha_inicio, fecha_fin, estado, materiales_construccion\r\n" + 
			"	FROM tipo_construccion \r\n" + 
			"		where estado=5\r\n" +  
			"        and fecha_inicio < sysdate();";
	
	
	@Query(value=ultimaConstruccionRegistro, nativeQuery = true)
	public List<TipoConstruccion> ultimaConstruccionRegistrada ();
	
	
	
	
}
