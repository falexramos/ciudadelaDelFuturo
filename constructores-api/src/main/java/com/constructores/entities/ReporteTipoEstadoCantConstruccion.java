package com.constructores.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReporteTipoEstadoCantConstruccion {

	@Id
	@Column(name="tipo_construccion")
	private String tipoConstruccion;
	
	@Column(name="estado_construccion")
	private String estadoConstruccion;
	
	@Column(name="cantidad")
	private Integer cantidad;

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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ReporteTipoEstadoCantConstruccion [tipoConstruccion=" + tipoConstruccion + ", estadoConstruccion="
				+ estadoConstruccion + ", cantidad=" + cantidad + "]";
	}
	
	
}
