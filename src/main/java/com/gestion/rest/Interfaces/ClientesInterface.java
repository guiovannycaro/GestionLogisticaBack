package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.Clientes;

public interface ClientesInterface {

	List<Clientes> devolverListaClientes() throws Exception;

	public Clientes devolverClienteById(int id) throws Exception ;

	Clientes buscarClientePorDato(Clientes datos)  throws Exception;
	 
	String agregarCliente(Clientes clientes)  throws Exception;

	String actualizarCliente(Clientes clientes)  throws Exception;

	String eliminarCliente(int id)  throws Exception;

}
