package com.gestion.rest.Interfaces;

import java.util.List;


import com.gestion.rest.Model.TipoPuerto;

public interface TipoPuertoInterface {

	List<TipoPuerto> devolverListaTipoPuerto() throws Exception;

	List<TipoPuerto> devolverTipoPuertoById(int id)  throws Exception;

	TipoPuerto buscarTipoPuertoPorDato(TipoPuerto datos)  throws Exception;
	 
	String agregarTipoPuerto(TipoPuerto datos)  throws Exception;

	String actualizarTipoPuerto(TipoPuerto datos)  throws Exception;

	String eliminarTipoPuerto(int id)  throws Exception;

}
