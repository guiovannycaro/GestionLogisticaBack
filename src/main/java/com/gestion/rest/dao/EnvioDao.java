package com.gestion.rest.dao;

import java.sql.ResultSet;
import java.util.List;

import com.gestion.rest.Interfaces.EnvioInterface;
import com.gestion.rest.Model.Envio;
import com.gestion.rest.Model.Productos;
import com.gestion.rest.util.executeQueryBD;

public class EnvioDao implements EnvioInterface{

	
	executeQueryBD query = new executeQueryBD();
	ResultSet resulSelect;

	
	@Override
	public List<Envio> devolverListaEnvio() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Envio> devolverEnvioById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Envio buscarTipoDetalleEnvioPorDato(Envio datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String agregarEnvio(Envio datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actualizarEnvio(Envio datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarEnvio(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Envio validarEnvioById(int idcliente) throws Exception {
		Envio en = new Envio();
		String sql = "select * from envio where env_clie_id = "+ idcliente +"";
		resulSelect = query.executeSelectBd(sql);
		while (resulSelect.next()) {
			
			en.setENV_ID(resulSelect.getInt("prod_nombre"));
			en.setENV_CLIE_ID(resulSelect.getInt("env_clie_id"));
			en.setENV_TELEFONO(resulSelect.getString("env_telefono"));
			en.setENV_FECHA_ENVIO(resulSelect.getDate("env_fecha_envio"));
			en.setENV_BOD_ID(resulSelect.getInt("env_bod_id"));
			en.setENV_PUER_ID(resulSelect.getInt("env_puer_id"));
			en.setENV_FECHA_ENTREGA(resulSelect.getDate("env_fecha_entrega"));
			en.setENV_CIU_ID(resulSelect.getInt("env_ciu_id"));
			en.setENV_TRAS_ID(resulSelect.getInt("env_tras_id"));
			
		}
		return en;
	}

}
