package com.gestion.rest.Interfaces;

import java.util.List;


import com.gestion.rest.Model.Usuarios;

public interface UsuariosInterface {

	List<Usuarios> devolverListaUsuarios() throws Exception;

	List<Usuarios> devolverUsuariosById(Usuarios u)  throws Exception;

	Usuarios buscarUsuariosPorDato(Usuarios datos)  throws Exception;
	 
	String agregarUsuario(Usuarios datos)  throws Exception;

	String actualizarUsuario(Usuarios datos)  throws Exception;

	String eliminarUsuario(int id)  throws Exception;

	public Usuarios findByEmail(String  valEmail) throws Exception;
}
