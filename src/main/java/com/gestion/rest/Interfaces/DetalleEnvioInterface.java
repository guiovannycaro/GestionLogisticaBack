package com.gestion.rest.Interfaces;

import java.util.List;


 import com.gestion.rest.Model.DetalleEnvio;


public interface DetalleEnvioInterface {

	List<DetalleEnvio> devolverListaDetalleEnvio() throws Exception;

	List<DetalleEnvio> devolverDetalleEnvioById(int id)  throws Exception;

	DetalleEnvio buscarTipoDetalleEnvioPorDato(DetalleEnvio datos)  throws Exception;
	 
	String agregarDetalleEnvio(int idcliente,DetalleEnvio datos)  throws Exception;


	String eliminarDetalleEnvio(int id)  throws Exception;

}
