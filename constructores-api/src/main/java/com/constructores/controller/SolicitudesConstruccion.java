package com.constructores.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.constructores.DAO.EstadoDAO;
import com.constructores.DAO.MaterialesDAO;
import com.constructores.DAO.MaterialesUsadosDAO;
import com.constructores.DAO.ReporteFechasProyectoDAO;
import com.constructores.DAO.ReporteTipoEstadoCantConstruccionDAO;
import com.constructores.DAO.ReportesConstruccionesPendientesDAO;
import com.constructores.DAO.TiempoConstruccionDAO;
import com.constructores.DAO.TipoConstruccionDAO;
import com.constructores.entities.Estado;
import com.constructores.entities.Materiales;
import com.constructores.entities.MaterialesUsados;
import com.constructores.entities.ReporteFechasProyecto;
import com.constructores.entities.ReporteTipoEstadoCantConstruccion;
import com.constructores.entities.ReportesConstruccionesPendientes;
import com.constructores.entities.TiempoConstruccion;
import com.constructores.entities.TipoConstruccion;
import com.constructores.entities.Todos;


@RestController
@RequestMapping("solicitudes")
public class SolicitudesConstruccion<E> {
	
	
	
	@Autowired
	private EstadoDAO estadoDAO;
	
	@Autowired
	private MaterialesDAO materialesDAO;
	
	@Autowired
	private MaterialesUsadosDAO materialesUsadosDAO; 
	
	@Autowired
	private TiempoConstruccionDAO tiempoConstruccionDAO;
	
	@Autowired
	private TipoConstruccionDAO tipoConstruccionDAO;
	
	@Autowired
	private ReporteFechasProyectoDAO reporteFechasProyectoDAO;
	
	@Autowired
	private ReportesConstruccionesPendientesDAO reportesConstruccionesPendientesDAO;
	
	@Autowired
	private ReporteTipoEstadoCantConstruccionDAO reporteTipoEstadoCantConstruccionDAO;
	
	
	@RequestMapping(value="/todos",method = RequestMethod.GET)
	public  ResponseEntity<Todos> verTodos(){
		java.util.List<Estado> estados = estadoDAO.findAll();
		java.util.List<Materiales> materiales =  materialesDAO.findAll();
		java.util.List<MaterialesUsados> materialesUsados =  materialesUsadosDAO.findAll();
		java.util.List<TiempoConstruccion> tiempoConstruccion =  tiempoConstruccionDAO.findAll();
		java.util.List<TipoConstruccion> tipoConstruccion =  tipoConstruccionDAO.findAll();
		
		Todos todoss = new Todos();
		todoss.setEstado(estados);
		todoss.setMateriales(materiales);
		todoss.setMaterialesUsados(materialesUsados);
		todoss.setTiempoConstruccion(tiempoConstruccion);
		todoss.setTipoConstruccion(tipoConstruccion);		
		
		return ResponseEntity.ok(todoss);
		
		
	}
	
	@RequestMapping(value="/estado",method = RequestMethod.GET)
	public  ResponseEntity<java.util.List<Estado>> verEstados(){
		java.util.List<Estado> estados = estadoDAO.findAll();
		return ResponseEntity.ok(estados);
	}
	
	@RequestMapping(value="/materiales",method = RequestMethod.GET)
	public  ResponseEntity<java.util.List<Materiales>> verMateriales(){
		java.util.List<Materiales> materiales =  materialesDAO.findAll();
		
		return ResponseEntity.ok(materiales);
		
	}
	
	@RequestMapping(value="/materialesUsados",method = RequestMethod.GET)
	public  ResponseEntity<java.util.List<MaterialesUsados>> verMaterialesUsados(){
		java.util.List<MaterialesUsados> materialesUsados =  materialesUsadosDAO.findAll();
		
		return ResponseEntity.ok(materialesUsados);
		
	}
	
	@RequestMapping(value="/tiempoCon",method = RequestMethod.GET)
	public  ResponseEntity<java.util.List<TiempoConstruccion>> vertiempoConstruccion(){
		java.util.List<TiempoConstruccion> tiempoConstruccion =  tiempoConstruccionDAO.findAll();
		
		return ResponseEntity.ok(tiempoConstruccion);
		
	}
	
	@RequestMapping(value="/verFechasProyecto",method = RequestMethod.GET)
	public  ResponseEntity<List<ReporteFechasProyecto>> verFechasProyecto() {
		List<ReporteFechasProyecto> reportes=   reporteFechasProyectoDAO.fechasProyecto();
		return ResponseEntity.ok(reportes);
		
	}
	
	@RequestMapping(value="/verConstruccionesPendientes",method = RequestMethod.GET)
	public  ResponseEntity<List<ReportesConstruccionesPendientes>> verConstruccionesPendientes(){
		
		List<ReportesConstruccionesPendientes> reportes=  
				(List<ReportesConstruccionesPendientes>) reportesConstruccionesPendientesDAO.consultarConstruccionesPendientes();
		return ResponseEntity.ok(reportes);
		
	}
	
	@RequestMapping(value="/verConstruccionesTipo",method = RequestMethod.GET)
	public  ResponseEntity<List<ReporteTipoEstadoCantConstruccion>> verConstruccionesTipo(){
		
		List<ReporteTipoEstadoCantConstruccion> reportes = reporteTipoEstadoCantConstruccionDAO.reporteTipoEstadoCantConstruccion();
		return ResponseEntity.ok(reportes);
		
	}
	
	

}
