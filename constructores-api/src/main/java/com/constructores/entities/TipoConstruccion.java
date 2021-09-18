package com.constructores.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_construccion")
public class TipoConstruccion {
	
	@Id
	@Column(name="idtipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipo;
	
	@Column(name="tipo_construccion")
	private String tipoConstruccion;
	
	@Column(name="coordenada_X")
	private Integer coordenadaX;
	
	@Column(name="coordenada_Y")
	private Integer coordenadaY;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechafin;
	
	@Column(name="estado")
	private Integer estado;
	
	@Column(name="materiales_construccion")
	private String materialesConstruccion;

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
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

	public void setCoordenaday(Integer coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMaterialesConstruccion() {
		return materialesConstruccion;
	}

	public void setMaterialesConstruccion(String materialesConstruccion) {
		this.materialesConstruccion = materialesConstruccion;
	}

	@Override
	public String toString() {
		return "TipoConstruccion [idTipo=" + idTipo + ", tipoConstruccion=" + tipoConstruccion + ", coordenadaX="
				+ coordenadaX + ", coordenaday=" + coordenadaY + ", fechaInicio=" + fechaInicio + ", fechafin="
				+ fechafin + ", estado=" + estado + ", materialesConstruccion=" + materialesConstruccion + "]";
	}
	
	
	
	
}
