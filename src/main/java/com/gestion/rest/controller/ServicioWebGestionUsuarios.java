package com.gestion.rest.controller;


import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.gestion.rest.dao.GestionUsuariosDao;
import com.gestion.rest.Model.User;
import com.gestion.rest.Model.Usuarios;
import com.gestion.rest.util.ExceptionUtil;

@RestController
//@CrossOrigin(origins = {"http://localhost:4200/"} )
@RequestMapping("/getion/GestionUsuarios")
public class ServicioWebGestionUsuarios {

	protected final Log log = LogFactory.getLog(this.getClass());

	@PostMapping(value = "/validarUsuario", produces = MediaType.APPLICATION_JSON_VALUE
		)
	public boolean validarUsuarios( @RequestBody User us
			) {
		try {
			GestionUsuariosDao gestionUsuarios = new GestionUsuariosDao();
			System.err.println("consulta1 " + us.getPassword());
			return gestionUsuarios.validarUsuarios(us);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return false;
		}
	}
	
	
	



	@PostMapping(value = "/cambiarContrasena")
	public String cambiarContrasena(
			@RequestParam(value = "usuusuario") String usuusuario,
			@RequestParam(value = "usucontrasena") String usucontrasena
			) {
		try {
			GestionUsuariosDao gestionUsuarios = new GestionUsuariosDao();
			return gestionUsuarios.cambiarContrasena(usuusuario, usucontrasena);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "error";
		}
	}
	
	@PostMapping(value = "/recordarContrasena")
	public String recordarContrasena(
			@RequestParam(value = "usuusuario") String usuusuario
			) {
		try {
			GestionUsuariosDao gestionUsuarios = new GestionUsuariosDao();
			return gestionUsuarios.recordarContrasena(usuusuario);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro ingresado no existe \"}";
		}
	}
	
	@PostMapping(value = "/obtenerPerfil")
	public String getPerfil(
			@RequestParam(value = "usuusuario") String usuusuario
			) {
		try {
			GestionUsuariosDao gestionUsuarios = new GestionUsuariosDao();
			return gestionUsuarios.getPerfil(usuusuario);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro ingresado no existe \"}";
		}
	}
	
	
}
