package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.Envio;

public interface EnvioInterface {

	List<Envio> devolverListaEnvio() throws Exception;

	List<Envio> devolverEnvioById(int id)  throws Exception;

	Envio buscarTipoDetalleEnvioPorDato(Envio datos)  throws Exception;
	 
	String agregarEnvio(Envio datos)  throws Exception;

	String actualizarEnvio(Envio datos)  throws Exception;

	String eliminarEnvio(int id)  throws Exception;
	
	Envio validarEnvioById(int idcliente)  throws Exception;
}
