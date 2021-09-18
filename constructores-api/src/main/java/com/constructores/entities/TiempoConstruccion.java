package com.constructores.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiempo_construccion")
public class TiempoConstruccion {

	@Id
	@Column(name="id_tiempo_construccion")
	private String idTiempoConstruccion;
	
	@Column(name="dias_construccion")
	private Integer diasConstruccion;

	public String getIdTiempoConstruccion() {
		return idTiempoConstruccion;
	}

	public void setIdTiempoConstruccion(String idTiempoConstruccion) {
		this.idTiempoConstruccion = idTiempoConstruccion;
	}

	public Integer getDiasConstruccion() {
		return diasConstruccion;
	}

	public void setDiasConstruccion(Integer diasConstruccion) {
		this.diasConstruccion = diasConstruccion;
	}

	@Override
	public String toString() {
		return "TiempoConstruccion [idTiempoConstruccion=" + idTiempoConstruccion + ", diasConstruccion="
				+ diasConstruccion + "]";
	}
	
	
}
