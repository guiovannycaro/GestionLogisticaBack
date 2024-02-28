package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.Bodega;


public interface BodegaInterface {

	List<Bodega> devolverListaBodega() throws Exception;

	List<Bodega> devolverBodegaById(int id)  throws Exception;

	Bodega buscarTipoBodegaPorDato(Bodega datos)  throws Exception;
	 
	String agregarBodega(Bodega datos)  throws Exception;

	String actualizarBodega(Bodega datos)  throws Exception;

	String eliminarBodega(int id)  throws Exception;

}
