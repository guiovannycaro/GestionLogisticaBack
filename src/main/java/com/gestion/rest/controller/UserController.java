package com.gestion.rest.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import com.gestion.rest.Model.Usuarios;
import com.gestion.rest.dao.UsuariosDao;
import com.gestion.rest.util.ExceptionUtil;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import java.util.regex.Matcher;

import org.springframework.http.MediaType;

//@CrossOrigin(origins = {"http://localhost:4200/"} )
@RestController
@RequestMapping("/getion/CrudUsuarios")
@Api(value = "Administracion de Usuarios")
public class UserController {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private List<Usuarios> users = new ArrayList<>();
	
	  @GetMapping(value = "/ListarTodosUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	 @ApiOperation(value = "Lista de Usuarios ", response = Usuarios.class, notes = "Crea un nuevo telefono")
	@ApiResponses({ @ApiResponse(code = 200, message = "Se crea  de manera correcta", response = Usuarios.class),
		@ApiResponse(code = 400, message = "Bad Request.El Usuarios Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
		@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class),
		@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class), })
	public List<Usuarios> ListarUsuarios() {
		try {
			UsuariosDao servicioUsuarios = new UsuariosDao();
			return servicioUsuarios.devolverListaUsuarios();
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return Collections.emptyList();
		}
	}
	  
	  
	  @GetMapping(value = "/ListarUsuariosById", produces = MediaType.APPLICATION_JSON_VALUE)
	 @ApiOperation(value = "Lista de Usuarios por Id ", response = Usuarios.class, notes = "Crea un nuevo telefono")
	@ApiResponses({ @ApiResponse(code = 200, message = "Se crea  de manera correcta", response = Usuarios.class),
		@ApiResponse(code = 400, message = "Bad Request.El Usuarios Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
		@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class),
		@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class), })
	  @ApiImplicitParams({
			@ApiImplicitParam(name = "Usuarios", required = true, paramType = "query", dataType = "Object", value = "Ojeto Usuarios", defaultValue = "{\r\n"
					+ "\"\"USU_ID\":xxx,\r\n"
					+ "\"USU_NOMBRES\": \"xxx\",\r\n"
					+ "\"USU_DIRECCION\": \"xxx\",\r\n"
					+ "\"USU_TELEFONO\":\"xxx\",\r\n"
					+ "\"USU_CORREO\":\"xxxx\",\r\n"
					+ "\"USU_NUMDOCUMENTO\":\"xxxx\",\r\n"
					+ "\"USU_PASSWORD\":\"xxxx\",\r\n"
					+ "\"USU_TDOC_ID\":\"xxxx\",\r\n"
					+ "\"USU_ROL_ID\": xxx \r\n"
					+ "}"), })
	public List<Usuarios> ListarUsuariosById(
			 @ApiParam(name = "Usuarios", value = "Recibe el objeto Usuarios", required = true)
			 @RequestBody Usuarios u) {
		try {
			UsuariosDao servicioUsuarios = new UsuariosDao();
			return servicioUsuarios.devolverUsuariosById(u);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return Collections.emptyList();
		}
	}
	  
	

	  @PostMapping(value = "/crearUsuarios", consumes = MediaType.APPLICATION_JSON_VALUE)
	  @ApiOperation(value = "Creacion de Usuarios", response = Usuarios.class, notes = "Crea un nuevo telefono")
		@ApiResponses({ @ApiResponse(code = 200, message = "Se crea  de manera correcta", response = Usuarios.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuarios Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class), })
	  
	  @ApiImplicitParams({
			@ApiImplicitParam(name = "Usuarios", required = true, paramType = "query", dataType = "Object", value = "Ojeto Usuarios", defaultValue = "{\r\n"
					+ "\"\"USU_ID\":xxx,\r\n"
					+ "\"USU_NOMBRES\": \"xxx\",\r\n"
					+ "\"USU_DIRECCION\": \"xxx\",\r\n"
					+ "\"USU_TELEFONO\":\"xxx\",\r\n"
					+ "\"USU_CORREO\":\"xxxx\",\r\n"
					+ "\"USU_NUMDOCUMENTO\":\"xxxx\",\r\n"
					+ "\"USU_PASSWORD\":\"xxxx\",\r\n"
					+ "\"USU_TDOC_ID\":\"xxxx\",\r\n"
					+ "\"USU_ROL_ID\": xxx \r\n"
					+ "}"), })
	  
		public String crearUsuario(
			    @ApiParam(name = "Usuarios", value = "Recibe el objeto Usuarios", required = true)
				@RequestBody Usuarios u
				) {
		  
		  String mensaje ="";
			try {
				UsuariosDao servicioUsuarios = new UsuariosDao();
				Usuarios us = new Usuarios();
				
				 Pattern pattern = Pattern
	                     .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                             + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	        	
	        	 Matcher mather = pattern.matcher(u.getUSU_CORREO());
	        	 String validaEmail ="";
	             if (mather.find() == true) {
	            	 validaEmail = u.getUSU_CORREO();
	             } else {
	            	 validaEmail = "{\"mensaje\":\"El email ingresado es inválido.\"}\";";
	            	 throw new Exception(" El email ingresado es inválido " + u.getUSU_CORREO());
	             }

	             
	             System.out.println("viene del front " + u.getUSU_ID());
		            Usuarios usu = new Usuarios();
		    		usu.setUSU_ID(u.getUSU_ID());
		    		usu.setUSU_NOMBRES(u.getUSU_NOMBRES());
		    		
		    		
		    		Usuarios users = servicioUsuarios.findByEmail(validaEmail);
		    		
		    		
		    		if (users != null) {
		    			usu.setUSU_CORREO(validaEmail);
		    		}else {
		    		usu.setUSU_CORREO("");
		    		}
		    		
		    		
		    		// Contraseña de 4-8 caracteres que requiere números y letras de ambos casos
				     String PASSWORD_REGEX =
				    		"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
				 
				    // Contraseña de 4 a 32 caracteres que requiere al menos 3 de 4 (mayúsculas
				    // y letras minúsculas, números y caracteres especiales) y como máximo
				    // 2 caracteres consecutivos iguales.
				    String COMPLEX_PASSWORD_REGEX =
				            "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
				            "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
				            "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
				            "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
				            "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
				            "{8,32}$";
				 
				  Pattern PASSWORD_PATTERN =
				                                    Pattern.compile(COMPLEX_PASSWORD_REGEX);
				  String validaPass ="";
				  if (PASSWORD_PATTERN.matcher(u.getUSU_PASSWORD()).matches()) {
					  validaPass = u.getUSU_PASSWORD();
			        }
			        else {
			        	 validaPass = "{\"mensaje\":\"La contraseña es invalida .\"}\";";
			        	 throw new Exception(" La contraseña es invalida " + u.getUSU_PASSWORD());
			        			 
			        }
				  
		    		usu.setUSU_PASSWORD(validaPass);
		    		
			        servicioUsuarios.agregarUsuario(us);

			        mensaje = "{\"mensaje\":\"El registro fue ingresado De Manera Correcta\"}";
			} catch (Exception e) {
				log.error(ExceptionUtil.format(e));
				 System.err.println("Se ha generado un erroral crear el usuario :  " + e.getMessage());
				 mensaje = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue ingresado De Manera Correcta\"}";
	
			}
			  return mensaje;
		}

	  @PostMapping(value = "/actualizarUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
	    @ApiOperation(value = "Actualizar de Usuarios", response = Usuarios.class, notes = "Crea un nuevo telefono")
		@ApiResponses({ @ApiResponse(code = 200, message = "Se crea  de manera correcta", response = Usuarios.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuarios Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuarios", response = Usuarios.class), })
	  @ApiImplicitParams({
			@ApiImplicitParam(name = "Usuarios", required = true, paramType = "query", dataType = "Object", value = "Ojeto Usuarios", defaultValue = "{\r\n"
					+ "\"\"USU_ID\":xxx,\r\n"
					+ "\"USU_NOMBRES\": \"xxx\",\r\n"
					+ "\"USU_DIRECCION\": \"xxx\",\r\n"
					+ "\"USU_TELEFONO\":\"xxx\",\r\n"
					+ "\"USU_CORREO\":\"xxxx\",\r\n"
					+ "\"USU_NUMDOCUMENTO\":\"xxxx\",\r\n"
					+ "\"USU_PASSWORD\":\"xxxx\",\r\n"
					+ "\"USU_TDOC_ID\":\"xxxx\",\r\n"
					+ "\"USU_ROL_ID\": xxx \r\n"
					+ "}"), })
		public String editarUsuario(
				   @ApiParam(name = "Usuarios", value = "Recibe el objeto Usuarios", required = true)
					@RequestBody Usuarios u
				) {
		  String mensaje ="";
			try {
				UsuariosDao servicioUsuarios = new UsuariosDao();
			
				 Pattern pattern = Pattern
	                     .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	                             + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	        	
	        	 Matcher mather = pattern.matcher(u.getUSU_CORREO());
	        	 String validaEmail ="";
	             if (mather.find() == true) {
	            	 validaEmail = u.getUSU_CORREO();
	             } else {
	            	 validaEmail = "{\"mensaje\":\"El email ingresado es inválido.\"}\";";
	            	  throw new Exception(" El email ingresado es inválido. " + u.getUSU_CORREO());
	             }
	             
	        	System.out.println("viene del front " + u.getUSU_ID());
	        	   Usuarios usu = new Usuarios();
		    		usu.setUSU_ID(u.getUSU_ID());
		    		usu.setUSU_NOMBRES(u.getUSU_NOMBRES());
	    		
	    		
	    		
	    		// Contraseña de 4-8 caracteres que requiere números y letras de ambos casos
			     String PASSWORD_REGEX =
			    		"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
			 
			    // Contraseña de 4 a 32 caracteres que requiere al menos 3 de 4 (mayúsculas
			    // y letras minúsculas, números y caracteres especiales) y como máximo
			    // 2 caracteres consecutivos iguales.
			    String COMPLEX_PASSWORD_REGEX =
			            "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
			            "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
			            "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
			            "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
			            "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
			            "{8,32}$";
			 
			  Pattern PASSWORD_PATTERN =
			                                    Pattern.compile(COMPLEX_PASSWORD_REGEX);
			  String validaPass ="";
			  if (PASSWORD_PATTERN.matcher(u.getUSU_PASSWORD()).matches()) {
				  validaPass = u.getUSU_PASSWORD();
		        }
		        else {
		        	 validaPass = "{\"mensaje\":\"La contraseña es invalida .\"}\";";
		        	 throw new Exception(" La contraseña es invalida ");
		        }
			  
			  usu.setUSU_PASSWORD(validaPass);
				
				       servicioUsuarios.actualizarUsuario(usu);

				 mensaje = "{\"mensaje\":\"El registro fue actualizado De Manera Correcta\"}";
			} catch (Exception e) {
				log.error(ExceptionUtil.format(e));
				System.err.println("Se ha generado un error  :  " + e.getMessage());
				mensaje = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue editado De Manera Correcta\"}";
			}
			 return mensaje;
		}

	  
	  
		
	}