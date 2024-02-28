package com.gestion.rest.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gestion.rest.Interfaces.ProductoInterface;

import com.gestion.rest.Model.Productos;
import com.gestion.rest.util.executeQueryBD;

public class ProductoDao implements ProductoInterface{

	executeQueryBD query = new executeQueryBD();
	ResultSet resulSelect;
	
	@Override
	public List<Productos> devolverListaProductos() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Productos> list = new ArrayList<>();
		String sql = "select * from producto";
		resulSelect = query.executeSelectBd(sql);
	
		while (resulSelect.next()) {
			Productos pr = new Productos();
			pr.setPRO_ID(resulSelect.getInt("prod_nombre"));
			pr.setPRO_NOMBRES(resulSelect.getString("prod_nombres"));
			pr.setPRO_DESCRIPCION(resulSelect.getString("prod_descripcion"));
			pr.setPRO_OBSERVACION(resulSelect.getString("prod_observacion"));
			pr.setPROD_VALOR(resulSelect.getDouble("prod_valor"));
			pr.setPROD_CANTIDAD(resulSelect.getDouble("prod_cantidad"));
			pr.setPRO_ESTADO(resulSelect.getInt("prod_estado"));
			list.add(pr);
		}
		return list;
	}

	@Override
	public List<Productos> devolverProductoById(int id) throws Exception {
		ArrayList<Productos> list = new ArrayList<>();
		String sql = "select * from producto where prod_id = "+ id +"";
		resulSelect = query.executeSelectBd(sql);
		
		while (resulSelect.next()) {
			Productos pr = new Productos();
			pr.setPRO_ID(resulSelect.getInt("prod_nombre"));
			pr.setPRO_NOMBRES(resulSelect.getString("prod_nombres"));
			pr.setPRO_DESCRIPCION(resulSelect.getString("prod_descripcion"));
			pr.setPRO_OBSERVACION(resulSelect.getString("prod_observacion"));
			pr.setPROD_VALOR(resulSelect.getDouble("prod_valor"));
			pr.setPROD_CANTIDAD(resulSelect.getDouble("prod_cantidad"));
			pr.setPRO_ESTADO(resulSelect.getInt("prod_estado"));
			list.add(pr);
		}
		return list;
	}

	@Override
	public Productos buscarProductosPorDato(Productos datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String agregarProductos(Productos clientes) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actualizarProductos(Productos clientes) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarProductos(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	public  Productos validarProductoById(int id) throws Exception {
		Productos pr = new Productos();
		String sql = "select * from producto where prod_id = "+ id +"";
		resulSelect = query.executeSelectBd(sql);
		while (resulSelect.next()) {
			
			pr.setPRO_ID(resulSelect.getInt("prod_nombre"));
			pr.setPRO_NOMBRES(resulSelect.getString("prod_nombres"));
			pr.setPRO_DESCRIPCION(resulSelect.getString("prod_descripcion"));
			pr.setPRO_OBSERVACION(resulSelect.getString("prod_observacion"));
			pr.setPROD_VALOR(resulSelect.getDouble("prod_valor"));
			pr.setPROD_CANTIDAD(resulSelect.getDouble("prod_cantidad"));
			pr.setPRO_ESTADO(resulSelect.getInt("prod_estado"));
			
		}
		return pr;
	}

}
