package com.constructores.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materiales")
public class Materiales {
	
	@Id
	@Column(name="construccion")
	private String construccion;
	
	@Column(name="cemento")
	private Integer cemento;
	
	@Column(name="grava")
	private Integer grava;
	
	@Column(name="arena")
	private Integer arena;
	
	@Column(name="madera")
	private Integer madera;
	
	@Column(name="abobe")
	private Integer adobe;

	public String getConstruccion() {
		return construccion;
	}

	public void setConstruccion(String construccion) {
		this.construccion = construccion;
	}

	public Integer getCemento() {
		return cemento;
	}

	public void setCemento(Integer cemento) {
		this.cemento = cemento;
	}

	public Integer getGrava() {
		return grava;
	}

	public void setGrava(Integer grava) {
		this.grava = grava;
	}

	public Integer getArena() {
		return arena;
	}

	public void setArena(Integer arena) {
		this.arena = arena;
	}

	public Integer getMadera() {
		return madera;
	}

	public void setMadera(Integer madera) {
		this.madera = madera;
	}

	public Integer getAdobe() {
		return adobe;
	}

	public void setAdobe(Integer adobe) {
		this.adobe = adobe;
	}

	@Override
	public String toString() {
		return "Materiales [construccion=" + construccion + ", cemento=" + cemento + ", grava=" + grava + ", arena="
				+ arena + ", madera=" + madera + ", adobe=" + adobe + "]";
	}
	
	
}
