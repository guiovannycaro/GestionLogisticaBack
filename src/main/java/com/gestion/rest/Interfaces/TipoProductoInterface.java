package com.gestion.rest.Interfaces;
import java.util.List;

import com.gestion.rest.Model.TipoProducto;

public interface TipoProductoInterface {

	List<TipoProducto> devolverListaTipoProducto() throws Exception;

	List<TipoProducto> devolverTipoProductoById(int id)  throws Exception;

	TipoProducto buscarTipoProductoPorDato(TipoProducto datos)  throws Exception;
	 
	String agregarTipoProducto(TipoProducto datos)  throws Exception;

	String actualizarTipoProducto(TipoProducto datos)  throws Exception;

	String eliminarTipoProducto(int id)  throws Exception;

}
