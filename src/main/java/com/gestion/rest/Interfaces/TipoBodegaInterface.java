package com.gestion.rest.Interfaces;

import java.util.List;


import com.gestion.rest.Model.TipoBodega;


public interface TipoBodegaInterface {

	List<TipoBodega> devolverListaTipoBodega() throws Exception;

	List<TipoBodega> devolverTipoBodegaById(int id)  throws Exception;

	TipoBodega buscarTipoBodegaPorDato(TipoBodega datos)  throws Exception;
	 
	String agregarTipoBodega(TipoBodega datos)  throws Exception;

	String actualizarTipoBodega(TipoBodega datos)  throws Exception;

	String eliminarTipoBodega(int id)  throws Exception;

}
