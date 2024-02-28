package com.gestion.rest.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.gestion.rest.Interfaces.GestionUsuariosInterface;
import com.gestion.rest.Model.User;
import com.gestion.rest.Model.Usuarios;
import com.gestion.rest.util.executeQueryBD;

public class GestionUsuariosDao implements  GestionUsuariosInterface{


	executeQueryBD query = new executeQueryBD();
	ResultSet resulSelect;
	
	@Override
	public boolean validarUsuarios(User u) throws Exception {
		
		System.err.println("consulta " + u.getUsername());
		 String sql = "select usu_correo,usu_password from usuarios usuarios where usu_correo  = '" + u.getUsername()
				 
				 + "'"
                 + " and usu_password ='" + u.getPassword() + "'";
		 System.err.println("consulta " + sql);
		 String vusuario ="";
		 String vcontrasena="";
		 resulSelect = query.executeSelectBd(sql);
		 while (resulSelect.next()) {
		    vusuario = resulSelect.getString("usu_correo");
		    System.err.println("nombre usuario " + vusuario);
			vcontrasena = resulSelect.getString("usu_password");

         } 
		 
		 if(vusuario.equals("") && vcontrasena.equals("")) {
			 return false;
		 }
		 return true;

	}

	@Override
	public String cambiarContrasena(String usuario, String clave) throws Exception {
		String validaIngreso;
		String sql = "Update   usuarios SET "
				+ "usu_password = '" + clave + "' "
				+ " WHERE usu_correo = " + usuario + " ";
		
		boolean rpt = query.executeUpdateBd(sql);
		if (rpt = true) {
			validaIngreso = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"la contraseña se modifico  De Manera Correcta\"}";
		} else {
			validaIngreso = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"la contraseña no se modifico  De Manera Correcta\"}";
		}
		return validaIngreso;
	}

	@Override
	public String recordarContrasena(String usuario) throws Exception {
		String contrasena = null;
		String sql = "select * from usuarios where usu_correo = "+ usuario +" ";
		resulSelect = query.executeSelectBd(sql);
		
		while (resulSelect.next()) {
			Usuarios us = new Usuarios();
			contrasena =	resulSelect.getString("usu_password");
		}
		return contrasena;
	}

	@Override
	public String getPerfil(String usuario) throws Exception {
		String perfil = null;
		String sql = "select usu_rol_id from usuarios where usu_correo = "+ usuario +" ";
		resulSelect = query.executeSelectBd(sql);
		while (resulSelect.next()) {
			Usuarios us = new Usuarios();
			perfil =	resulSelect.getString("usu_rol_id");
		}
		return perfil;
	}
}
