package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.TipoDocumento;


public interface TipoDocumentoInterface {

	List<TipoDocumento> devolverListaTipoDocumento() throws Exception;

	List<TipoDocumento> devolverTipoDocumentoById(int id)  throws Exception;

	TipoDocumento buscarTipoDocumentoPorDato(TipoDocumento datos)  throws Exception;
	 
	String agregarTipoDocumento(TipoDocumento datos)  throws Exception;

	String actualizarTipoDocumento(TipoDocumento datos)  throws Exception;

	String eliminarTipoDocumento(int id)  throws Exception;

}
