package com.constructores.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado {
	
	@Id
	@Column(name="idestado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstado; 
	
	@Column(name="estado_construccion")
	private String estadoConstruccion;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstadoConstruccion() {
		return estadoConstruccion;
	}

	public void setEstadoConstruccion(String estadoConstruccion) {
		this.estadoConstruccion = estadoConstruccion;
	}

	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", estadoConstruccion=" + estadoConstruccion + "]";
	}
	
	
	
}
