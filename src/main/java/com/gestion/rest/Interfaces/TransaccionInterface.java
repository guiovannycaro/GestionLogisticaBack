package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.Envio;
import com.gestion.rest.Model.Transaccion;


public interface TransaccionInterface {

	List<Transaccion> devolverListaEnvio() throws Exception;

	List<Transaccion> devolverEnvioById(int id)  throws Exception;

	Transaccion buscarEnvioPorDato(Transaccion datos)  throws Exception;
	 
	String agregarTransaccion(Envio datos)  throws Exception;

	

}
