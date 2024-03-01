package com.gestion.rest.controller;

import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.rest.dao.ClientesDao;
import com.gestion.rest.dao.UsuariosDao;
import com.gestion.rest.Model.Clientes;
import com.gestion.rest.Model.Usuarios;
import com.gestion.rest.util.ExceptionUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("/getion/CrudClientes")
@Api(value = "Servicio Clientes")
public class ServicioWebClientes {

	protected final Log log = LogFactory.getLog(this.getClass());

	@GetMapping(value = "/ListarClientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Consulta Cliente", response = Clientes.class, notes = "Obtiene todos Los Clientes ")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La consulta se Ejecuto de manera correcta", response = Clientes.class),
		@ApiResponse(code = 400, message = "Bad Request.No existen Clientes Asociados a esa cedula(String)", response = Clientes.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
		@ApiResponse(code = 401, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class),
		@ApiResponse(code = 404, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class), })
	public List<Clientes> ListarClientes() {
		try {
			ClientesDao servicioCliente = new ClientesDao();
			return servicioCliente.devolverListaClientes();
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return Collections.emptyList();
		}
	}

	@GetMapping(value = "/buscarClientesById", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Consulta Cliente por id", response = Clientes.class, notes = "Obtiene todos Los Clientes por id ")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La consulta se Ejecuto de manera correcta", response = Clientes.class),
		@ApiResponse(code = 400, message = "Bad Request.No existen Clientes Asociados a esa cedula(String)", response = Clientes.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
		@ApiResponse(code = 401, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class),
		@ApiResponse(code = 404, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class), })
	
	  @ApiImplicitParams({
			@ApiImplicitParam(name = "Usuarios", required = true, paramType = "query", dataType = "Object", value = "Ojeto Usuarios", defaultValue = 
					"{\r\n"
				    	+ "\"\"id\":xxx\r\n"
					+ "}"), })
	public Clientes buscarClientesById(
			@ApiParam(name = "Clientes", value = "Recibe el objeto Clientes", required = true)
	 @RequestParam Integer id) {
		
		Clientes c = null;
		try {
			ClientesDao servicioCliente = new ClientesDao();
			return c;
			//return c = servicioCliente.devolverClienteById(id);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return c;
		}
	}
	
	  @GetMapping(value = "/ListarClientesById", produces = MediaType.APPLICATION_JSON_VALUE)
		 @ApiOperation(value = "Lista de Clientes por Id ", response = Usuarios.class, notes = "Crea un nuevo telefono")
		@ApiResponses({ @ApiResponse(code = 200, message = "Se crea  de manera correcta", response = Clientes.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuarios Ingresado Esta Mal Digitado(String)", response = Clientes.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuarios", response = Clientes.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuarios", response = Clientes.class), })
		  @ApiImplicitParams({
				@ApiImplicitParam(name = "Clientes", required = true, paramType = "query", dataType = "Object", value = "Ojeto Usuarios", defaultValue = 
						"{\r\n"
					    	+ "\"\"id\":xxx\r\n"
						+ "}"), })
		public Clientes ListarClientesById(
				 @ApiParam(name = "Clientes", value = "Recibe el objeto Usuarios", required = true)
				 @RequestParam Integer id) {
				Clientes u = null;
			try {
			
				ClientesDao servicioClientes = new ClientesDao();
				return u = servicioClientes.devolverClientesById(id);
			} catch (Exception e) {
				log.error(ExceptionUtil.format(e));
				return u;
			}
		}

	@PostMapping(value = "/crearClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Consulta crear clientes", response = Clientes.class, notes = "crea un nuevo cliente ")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La consulta se Ejecuto de manera correcta", response = Clientes.class),
		@ApiResponse(code = 400, message = "Bad Request.No existen Clientes Asociados a esa cedula(String)", response = Clientes.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
		@ApiResponse(code = 401, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class),
		@ApiResponse(code = 404, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class), })
	public String crearClientes(
			
			 @RequestBody Clientes c
			 
		) {
		try {
			ClientesDao servicioCliente = new ClientesDao();
	
			return servicioCliente.agregarCliente(c);

		
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue ingresado De Manera Correcta\"}";
		}
	}

	@PostMapping(value = "/editarClientes", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Consulta editar clientes", response = Clientes.class, notes = "edita un  cliente ")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La consulta se Ejecuto de manera correcta", response = Clientes.class),
		@ApiResponse(code = 400, message = "Bad Request.No existen Clientes Asociados a esa cedula(String)", response = Clientes.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
		@ApiResponse(code = 401, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class),
		@ApiResponse(code = 404, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class), })
	public String editarClientes(
			 @RequestBody Clientes c) {
		try {
			ClientesDao servicioCliente = new ClientesDao();
		
			return servicioCliente.actualizarCliente(c);

			
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue editado De Manera Correcta\"}";
		}
	}

	@GetMapping(value = "/eliminarClientes")
	@ApiOperation(value = "Consulta eliminar clientes", response = Clientes.class, notes = "elimina un cliente ")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La consulta se Ejecuto de manera correcta", response = Clientes.class),
		@ApiResponse(code = 400, message = "Bad Request.No existen Clientes Asociados a esa cedula(String)", response = Clientes.class),
		@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Clientes.class),
		@ApiResponse(code = 403, message = "Acceso denegado", response = Clientes.class),
		@ApiResponse(code = 401, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class),
		@ApiResponse(code = 404, message = "No existen Clientes Asociados a esa cedula", response = Clientes.class), })
	public String eliminarCliente(
			@ApiParam(name = "cliid", value = "id cliente", required = true, example = "00000000") 
			@RequestParam(value = "id") Integer id) {
		try {
			ClientesDao servicioCliente = new ClientesDao();
			return servicioCliente.eliminarCliente(id);
		
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return "error";
		}
	}

}
