package com.gestion.rest.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gestion.rest.Interfaces.UsuariosInterface;
import com.gestion.rest.Model.Usuarios;
import com.gestion.rest.util.executeQueryBD;

public class UsuariosDao implements   UsuariosInterface{

	executeQueryBD query = new executeQueryBD();
	ResultSet resulSelect;
	
	@Override
	public List<Usuarios> devolverListaUsuarios() throws Exception {
		ArrayList<Usuarios> list = new ArrayList<>();
		String sql = "select * from usuarios";
		System.out.println("consulta " + sql);
		resulSelect = query.executeSelectBd(sql);
		while (resulSelect.next()) {
			Usuarios us = new Usuarios();
			us.setUSU_ID(resulSelect.getInt("usu_id"));
			us.setUSU_NOMBRES(resulSelect.getString("usu_nombres"));
			us.setUSU_DIRECCION(resulSelect.getString("usu_direccion"));
			us.setUSU_TELEFONO(resulSelect.getString("usu_telefono"));
			us.setUSU_CORREO(resulSelect.getString("usu_correo"));
			us.setUSU_NUMDOCUMENTO(resulSelect.getString("usu_numdocumento"));
			us.setUSU_PASSWORD(resulSelect.getString("usu_password"));
			us.setUSU_TDOC_ID(resulSelect.getInt("usu_tdoc_id"));
			us.setUSU_ROL_ID(resulSelect.getInt("usu_rol_id"));
			us.setUSU_ESTADO(resulSelect.getInt("usu_estado"));
			System.out.println("usuario " + us.getUSU_ROL_ID());
			list.add(us);
		}
		return list;
	}

	
	
	
	
	@Override
	public List<Usuarios> devolverUsuariosById(Usuarios u) throws Exception {
		ArrayList<Usuarios> list = new ArrayList<>();
		String sql = "select * from usuarios where usu_id = "+ u.getUSU_ID() +" ";
		resulSelect = query.executeSelectBd(sql);
		while (resulSelect.next()) {
			Usuarios us = new Usuarios();
			us.setUSU_ID(resulSelect.getInt("usu_id"));
			us.setUSU_NOMBRES(resulSelect.getString("usu_nombres"));
			us.setUSU_DIRECCION(resulSelect.getString("usu_direccion"));
			us.setUSU_TELEFONO(resulSelect.getString("usu_telefono"));
			us.setUSU_CORREO(resulSelect.getString("usu_correo"));
			us.setUSU_NUMDOCUMENTO(resulSelect.getString("usu_numdocumento"));
			us.setUSU_PASSWORD(resulSelect.getString("usu_password"));
			us.setUSU_TDOC_ID(resulSelect.getInt("usu_tdoc_id"));
			us.setUSU_ROL_ID(resulSelect.getInt("usu_rol_id"));
			us.setUSU_ESTADO(resulSelect.getInt("usu_estado"));
			list.add(us);
		}
		return list;
	}

	@Override
	public Usuarios buscarUsuariosPorDato(Usuarios datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String agregarUsuario(Usuarios usu) throws Exception {
		String validaIngreso;
		String sql = "insert into  usuarios (usu_nombres,usu_direccion,usu_telefono"
				+ ",usu_correo,usu_numdocumento,usu_password,usu_tdoc_id,usu_rol_id,usu_estado) " + "values("
						+ "'" + usu.getUSU_NOMBRES() + "','" + usu.getUSU_DIRECCION() + "','"
				+ usu.getUSU_TELEFONO() + "'," + "'" + usu.getUSU_CORREO() + "'," + usu.getUSU_NUMDOCUMENTO() + ",'"
				+ usu.getUSU_PASSWORD() + "',"+usu.getUSU_TDOC_ID()+","+usu.getUSU_ROL_ID()+","+usu.getUSU_ESTADO()+")  ";
		System.out.println("consulta " + sql);
		boolean rpt = query.executeUpdateBd(sql);
		System.out.println("repuesta " + rpt);
		if (rpt = true) {
			validaIngreso = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro fue ingresado De Manera Correcta\"}";
		} else {
			validaIngreso = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue ingresado De Manera Correcta\"}";
		}
		return validaIngreso;
	}

	@Override
	public String actualizarUsuario(Usuarios usu) throws Exception {
		String validaIngreso;
		String sql = "Update   usuarios SET "
				+ "usu_nombres = '" + usu.getUSU_NOMBRES() + "',"
				+ "usu_direccion = '" + usu.getUSU_DIRECCION() + "',"
				+ "usu_telefono = '" + usu.getUSU_TELEFONO() + "',"
				+ "usu_correo = '" + usu.getUSU_CORREO() + "',"
				+ "usu_numdocumento = '" + usu.getUSU_NUMDOCUMENTO() + "',"
				+ "usu_password = '" + usu.getUSU_PASSWORD() + "', "
				+ "usu_tdoc_id = '" + usu.getUSU_TDOC_ID() + "', "
				+ "usu_rol_id = '" + usu.getUSU_ROL_ID() + "', "
						+ "usu_estado = '" + usu.getUSU_ESTADO() + "', "
				+ " WHERE usu_id = " + usu.getUSU_ID() + " ";
		
		boolean rpt = query.executeUpdateBd(sql);
		if (rpt = true) {
			validaIngreso = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro fue EDITADO De Manera Correcta\"}";
		} else {
			validaIngreso = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue EDITADO De Manera Correcta\"}";
		}
		return validaIngreso;
	}

	@Override
	public String eliminarUsuario(int id) throws Exception {
		String validaIngreso;
		String sql = "Delete from  usuarios "
				+ " WHERE usu_id = " + id + " ";

		boolean rpt = query.executeUpdateBd(sql);
		if (rpt = true) {
			validaIngreso = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro fue eliminado De Manera Correcta\"}";
		} else {
			validaIngreso = "{\"codigo\":\"500\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro no fue eliminado De Manera Correcta\"}";
		}
		return validaIngreso;
	}
	
	
	@Override
	public Usuarios findByEmail(String  valEmail) throws Exception {
		ArrayList<Usuarios> list = new ArrayList<>();
		String sql = "select * from usuarios where usu_correo = '"+ valEmail +"' ";
		resulSelect = query.executeSelectBd(sql);
		Usuarios us = new Usuarios();
		while (resulSelect.next()) {
		
			us.setUSU_ID(resulSelect.getInt("usu_id"));
			us.setUSU_NOMBRES(resulSelect.getString("usu_nombres"));
			us.setUSU_DIRECCION(resulSelect.getString("usu_direccion"));
			us.setUSU_TELEFONO(resulSelect.getString("usu_telefono"));
			us.setUSU_CORREO(resulSelect.getString("usu_correo"));
			us.setUSU_NUMDOCUMENTO(resulSelect.getString("usu_numdocumento"));
			us.setUSU_PASSWORD(resulSelect.getString("usu_password"));
			us.setUSU_TDOC_ID(resulSelect.getInt("usu_tdoc_id"));
			us.setUSU_ROL_ID(resulSelect.getInt("usu_rol_id"));
			us.setUSU_ESTADO(resulSelect.getInt("usu_estado"));
			
		}
		return us;
	}
	
}
