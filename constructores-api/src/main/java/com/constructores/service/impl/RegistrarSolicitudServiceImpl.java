package com.constructores.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.constructores.DAO.MaterialesDAO;
import com.constructores.DAO.MaterialesUsadosDAO;
import com.constructores.DAO.TiempoConstruccionDAO;
import com.constructores.DAO.TipoConstruccionDAO;
import com.constructores.entities.Materiales;
import com.constructores.entities.MaterialesUsados;
import com.constructores.entities.TiempoConstruccion;
import com.constructores.entities.TipoConstruccion;
import com.constructores.repository.TipoConstruccionRepository;
import com.constructores.services.RegistrarSolicitudServices;
import com.constructores.util.TipoConstruccionResultDTO;
import com.constructores.util.Constantes;

@Service
public class RegistrarSolicitudServiceImpl implements RegistrarSolicitudServices {

	@Autowired
	private TipoConstruccionDAO tipoConstruccionDAO;

	@Autowired
	private MaterialesUsadosDAO materialesUsadosDAO;

	@Autowired
	private MaterialesDAO materialesDAO;

	@Autowired
	private TiempoConstruccionDAO tiempoConstruccionDAO;

	
	
	@Transactional
	public TipoConstruccionResultDTO registrarSolicitudConstruccion(TipoConstruccion tipoConstruccion) {

		TipoConstruccionResultDTO tipoConstruccionResultDTO = new TipoConstruccionResultDTO();

		List<Materiales> materiales = materialesDAO.buscarMaterial(tipoConstruccion.getTipoConstruccion());

		String vaidaMaterial = "";
		boolean validarCoordenadaXY = validarCoordenadas(tipoConstruccion.getCoordenadaX(),
				tipoConstruccion.getCoordenadaY());

		if (validarCoordenadaXY) {
			vaidaMaterial = validarMateriales(tipoConstruccion, materiales);

			if (vaidaMaterial.equals(Constantes.validaMaterialCon)) {

				agendarConstruccion(tipoConstruccion);

				tipoConstruccionResultDTO.setCodigo(tipoConstruccion.getIdTipo().toString());
				tipoConstruccionResultDTO.setMensaje(Constantes.solicitudAgendada);
				
				MaterialesUsados registrarMaterialesUSados = registroMaterialesUsados(tipoConstruccion.getIdTipo(), materiales);

				materialesUsadosDAO.save(registrarMaterialesUSados);
				
				actualizarEstadoFinalizadoTipoConstruccion();
				
				actualizarEstadoProgresoTipoConstruccion();

			} else if (vaidaMaterial.equals(Constantes.validaMaterialSin)) {
				tipoConstruccionResultDTO.setCodigo("error");
				tipoConstruccionResultDTO.setMensaje(vaidaMaterial);
			}

		} else {

			tipoConstruccionResultDTO.setCodigo("error coordenandas");
			tipoConstruccionResultDTO.setMensaje("Ya existe una construccion en las corrdenadas indicadas");

		}

		return tipoConstruccionResultDTO;
	}

	private boolean validarCoordenadas(Integer coordenadaX, Integer coordenadaY) {

		List<TipoConstruccion> buscarX = tipoConstruccionDAO.getCoordenadas(coordenadaX, coordenadaY);

		return buscarX.isEmpty();
	}

	public String validarMateriales(TipoConstruccion tipoConstruccion, List<Materiales> materiales) {

		String validaMateriales = "";

		List<MaterialesUsados> materialesUsados = materialesUsadosDAO.sumaMateriales();

		for (int indice = 0; indice < materialesUsados.size(); indice++) {
			validaMateriales = (materialesUsados.get(indice).getCemento() < materiales.get(indice).getCemento())
					? Constantes.validaMaterialSin
					: Constantes.validaMaterialCon;
			validaMateriales = (materialesUsados.get(indice).getGrava() < materiales.get(indice).getGrava())
					? Constantes.validaMaterialSin
					: Constantes.validaMaterialCon;
			validaMateriales = (materialesUsados.get(indice).getArena() < materiales.get(indice).getArena())
					? Constantes.validaMaterialSin
					: Constantes.validaMaterialCon;
			validaMateriales = (materialesUsados.get(indice).getMadera() < materiales.get(indice).getMadera())
					? Constantes.validaMaterialSin
					: Constantes.validaMaterialCon;
			validaMateriales = (materialesUsados.get(indice).getAdobe() < materiales.get(indice).getAdobe())
					? Constantes.validaMaterialSin
					: Constantes.validaMaterialCon;
		}

		return validaMateriales;

	}

	public TipoConstruccion agendarConstruccion(TipoConstruccion tipoConstruccion) {

		int estadoPendiente = 5;
		Date consultarMayorFecha = (Date) tipoConstruccionDAO.consultaMayorFecha();

		Optional<TiempoConstruccion> diasConstruccion = tiempoConstruccionDAO
				.findById(tipoConstruccion.getTipoConstruccion());

		int diasFechaFinSolicitud = diasConstruccion.get().getDiasConstruccion() * 1000;

		Date fechaFinActual = new Date(consultarMayorFecha.getTime());
		Date fechaInicioSolicitud = new Date(fechaFinActual.getTime() + (1000 * 60 * 60 * 24));
		Date fechaFinSolicitud = new Date(fechaFinActual.getTime() + (diasFechaFinSolicitud * 60 * 60 * 24));

		tipoConstruccion.setCoordenadaX(tipoConstruccion.getCoordenadaX());
		tipoConstruccion.setCoordenaday(tipoConstruccion.getCoordenadaY());
		tipoConstruccion.setTipoConstruccion(tipoConstruccion.getTipoConstruccion());
		tipoConstruccion.setFechaInicio(fechaInicioSolicitud);
		tipoConstruccion.setFechafin(fechaFinSolicitud);
		tipoConstruccion.setEstado(estadoPendiente);
		tipoConstruccion.setMaterialesConstruccion(tipoConstruccion.getMaterialesConstruccion());

		return tipoConstruccionDAO.save(tipoConstruccion);

	}

	private MaterialesUsados registroMaterialesUsados(Integer tipoConstruccion, List<Materiales> materiales) {

		MaterialesUsados materialesUsados = new MaterialesUsados();
		materialesUsados.setAdobe(materiales.get(0).getAdobe() * -1);
		materialesUsados.setArena(materiales.get(0).getArena() * -1);
		materialesUsados.setCemento(materiales.get(0).getCemento() * -1);
		materialesUsados.setGrava(materiales.get(0).getGrava() * -1);
		materialesUsados.setMadera(materiales.get(0).getMadera() * -1);
		materialesUsados.setTipoConstruccion(tipoConstruccion);
		return materialesUsados;

	}
	
	private void actualizarEstadoFinalizadoTipoConstruccion() {
		
		Date fechaInicio = (Date) tipoConstruccionDAO.consultaMayorFechaInicio();
		
		tipoConstruccionDAO.actualizaEstadosFinalizada(fechaInicio);
		
	}
	
	private void actualizarEstadoProgresoTipoConstruccion() {
		Integer estadoProgreso = 3;
		try {
			List<TipoConstruccion> actualizaEstadoProgreso = tipoConstruccionDAO.ultimaConstruccionRegistrada();
			TipoConstruccion tipoConstruccionEstado = (TipoConstruccion) actualizaEstadoProgreso;
			tipoConstruccionEstado.setEstado(estadoProgreso);
			tipoConstruccionDAO.save(tipoConstruccionEstado);
		} catch (Exception e) {
			
		}
		
	}

}
