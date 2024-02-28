package com.gestion.rest.Interfaces;

import java.util.List;


import com.gestion.rest.Model.Productos;

public interface ProductoInterface {

	List<Productos> devolverListaProductos() throws Exception;

	List<Productos> devolverProductoById(int id)  throws Exception;

	Productos buscarProductosPorDato(Productos datos)  throws Exception;
	 
	String agregarProductos(Productos clientes)  throws Exception;

	String actualizarProductos(Productos clientes)  throws Exception;

	String eliminarProductos(int id)  throws Exception;
	
	Productos   validarProductoById(int id)  throws Exception;

}
