package com.constructores.util;

public class SentenciasSql {

	public static String BUSCAR_COORDENADAS="SELECT tc.idtipo FROM tipo_construccion tc "
												+ " where tc.coordenada_X = :coordenadaX "
												+ " and 	 tc.coordenada_Y = :coordenadaY";
	
}
