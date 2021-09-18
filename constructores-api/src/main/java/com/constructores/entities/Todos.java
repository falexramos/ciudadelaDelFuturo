package com.constructores.entities;

import java.util.List;

public class Todos {
	
	
	private List<Estado> estado;
	private List<Materiales> materiales;
	private List<MaterialesUsados> materialesUsados;
	private List<TiempoConstruccion> tiempoConstruccion;
	private List<TipoConstruccion> tipoConstruccion;
	
	
	
	public List<MaterialesUsados> getMaterialesUsados() {
		return materialesUsados;
	}
	public void setMaterialesUsados(List<MaterialesUsados> materialesUsados) {
		this.materialesUsados = materialesUsados;
	}
	public List<TiempoConstruccion> getTiempoConstruccion() {
		return tiempoConstruccion;
	}
	public void setTiempoConstruccion(List<TiempoConstruccion> tiempoConstruccion) {
		this.tiempoConstruccion = tiempoConstruccion;
	}
	public List<TipoConstruccion> getTipoConstruccion() {
		return tipoConstruccion;
	}
	public void setTipoConstruccion(List<TipoConstruccion> tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}
	public List<Estado> getEstado() {
		return estado;
	}
	public void setEstado(List<Estado> estado) {
		this.estado = estado;
	}
	public List<Materiales> getMateriales() {
		return materiales;
	}
	public void setMateriales(List<Materiales> materiales) {
		this.materiales = materiales;
	}
	@Override
	public String toString() {
		return "Todos [estado=" + estado + ", materiales=" + materiales + ", materialesUsados=" + materialesUsados
				+ ", tiempoConstruccion=" + tiempoConstruccion + ", tipoConstruccion=" + tipoConstruccion + "]";
	}
	
	
	
}
