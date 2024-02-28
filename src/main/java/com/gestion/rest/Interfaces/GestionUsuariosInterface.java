package com.gestion.rest.Interfaces;

import com.gestion.rest.Model.User;
import com.gestion.rest.Model.Usuarios;

public interface GestionUsuariosInterface {
	public boolean validarUsuarios(User u) throws Exception;
	
	String cambiarContrasena(String usuario, String clave)  throws Exception;
	
	String recordarContrasena(String usuario)  throws Exception;
	
	String getPerfil(String usuario) throws Exception;

}
