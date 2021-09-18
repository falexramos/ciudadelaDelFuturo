package com.constructores.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materiales_usados")
public class MaterialesUsados {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="cemento")
	private Integer cemento;
	
	@Column(name="grava")
	private Integer grava;
	
	@Column(name="arena")
	private Integer arena;
	
	@Column(name="madera")
	private Integer madera;
	
	@Column(name="adobe")
	private Integer adobe;
	
	@Column(name="tipo_construccion")
	private Integer tipoConstruccion;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(Integer tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	@Override
	public String toString() {
		return "MaterialesUsados [id=" + id + ", cemento=" + cemento + ", grava=" + grava + ", arena=" + arena
				+ ", madera=" + madera + ", adobe=" + adobe + ", tipoConstruccion=" + tipoConstruccion + "]";
	}
	
	
}
