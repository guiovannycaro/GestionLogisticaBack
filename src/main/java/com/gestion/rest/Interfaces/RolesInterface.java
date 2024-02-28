package com.gestion.rest.Interfaces;

import java.util.List;

import com.gestion.rest.Model.Roles;


public interface RolesInterface {

	List<Roles> devolverListaRoles() throws Exception;

	List<Roles> devolverRolesById(int id)  throws Exception;

	Roles buscarRolesPorDato(Roles datos)  throws Exception;
	 
	String agregarRoles(Roles datos)  throws Exception;

	String actualizarRoles(Roles datos)  throws Exception;

	String eliminarRoles(int id)  throws Exception;

}
