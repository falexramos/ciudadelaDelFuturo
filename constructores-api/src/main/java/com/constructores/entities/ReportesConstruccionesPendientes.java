package com.constructores.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReportesConstruccionesPendientes {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;
	
	@Column(name="tipo_construccion")
	private String tipoConstruccion;
	
	@Column(name="estado_construccion")
	private String estadoConstruccion;
	
	@Column(name="coordenada_X")
	private Integer coordenadaX;
	
	@Column(name="coordenada_Y")
	private Integer coordenadaY;
	
	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public String getEstadoConstruccion() {
		return estadoConstruccion;
	}

	public void setEstadoConstruccion(String estadoConstruccion) {
		this.estadoConstruccion = estadoConstruccion;
	}

	public Integer getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(Integer coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public Integer getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(Integer coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	
	
	
}
