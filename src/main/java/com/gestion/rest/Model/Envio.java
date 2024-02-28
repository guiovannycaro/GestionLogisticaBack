package com.gestion.rest.Model;

import java.util.Date;

public class Envio {
	
	Integer ENV_ID;
	
	Integer ENV_CLIE_ID;
	
	String ENV_TELEFONO;
	
	Date ENV_FECHA_ENVIO;
	
	Integer ENV_BOD_ID;
	
	Integer ENV_PUER_ID;
	
	Date ENV_FECHA_ENTREGA;
	
	Integer ENV_CIU_ID;
	
	Integer ENV_TRAS_ID;
	
	
	public Envio() {

	}


	public Envio(Integer eNV_ID, Integer eNV_CLIE_ID, String eNV_TELEFONO, Date eNV_FECHA_ENVIO, Integer eNV_BOD_ID,
			Integer eNV_PUER_ID, Date eNV_FECHA_ENTREGA, Integer eNV_CIU_ID, Integer eNV_TRAS_ID) {
		ENV_ID = eNV_ID;
		ENV_CLIE_ID = eNV_CLIE_ID;
		ENV_TELEFONO = eNV_TELEFONO;
		ENV_FECHA_ENVIO = eNV_FECHA_ENVIO;
		ENV_BOD_ID = eNV_BOD_ID;
		ENV_PUER_ID = eNV_PUER_ID;
		ENV_FECHA_ENTREGA = eNV_FECHA_ENTREGA;
		ENV_CIU_ID = eNV_CIU_ID;
		ENV_TRAS_ID = eNV_TRAS_ID;
	}


	public Integer getENV_ID() {
		return ENV_ID;
	}


	public void setENV_ID(Integer eNV_ID) {
		ENV_ID = eNV_ID;
	}


	public Integer getENV_CLIE_ID() {
		return ENV_CLIE_ID;
	}


	public void setENV_CLIE_ID(Integer eNV_CLIE_ID) {
		ENV_CLIE_ID = eNV_CLIE_ID;
	}


	public String getENV_TELEFONO() {
		return ENV_TELEFONO;
	}


	public void setENV_TELEFONO(String eNV_TELEFONO) {
		ENV_TELEFONO = eNV_TELEFONO;
	}


	public Date getENV_FECHA_ENVIO() {
		return ENV_FECHA_ENVIO;
	}


	public void setENV_FECHA_ENVIO(Date eNV_FECHA_ENVIO) {
		ENV_FECHA_ENVIO = eNV_FECHA_ENVIO;
	}


	public Integer getENV_BOD_ID() {
		return ENV_BOD_ID;
	}


	public void setENV_BOD_ID(Integer eNV_BOD_ID) {
		ENV_BOD_ID = eNV_BOD_ID;
	}


	public Integer getENV_PUER_ID() {
		return ENV_PUER_ID;
	}


	public void setENV_PUER_ID(Integer eNV_PUER_ID) {
		ENV_PUER_ID = eNV_PUER_ID;
	}


	public Date getENV_FECHA_ENTREGA() {
		return ENV_FECHA_ENTREGA;
	}


	public void setENV_FECHA_ENTREGA(Date eNV_FECHA_ENTREGA) {
		ENV_FECHA_ENTREGA = eNV_FECHA_ENTREGA;
	}


	public Integer getENV_CIU_ID() {
		return ENV_CIU_ID;
	}


	public void setENV_CIU_ID(Integer eNV_CIU_ID) {
		ENV_CIU_ID = eNV_CIU_ID;
	}


	public Integer getENV_TRAS_ID() {
		return ENV_TRAS_ID;
	}


	public void setENV_TRAS_ID(Integer eNV_TRAS_ID) {
		ENV_TRAS_ID = eNV_TRAS_ID;
	}


	@Override
	public String toString() {
		return "Envio [ENV_ID=" + ENV_ID + ", ENV_CLIE_ID=" + ENV_CLIE_ID + ", ENV_TELEFONO=" + ENV_TELEFONO
				+ ", ENV_FECHA_ENVIO=" + ENV_FECHA_ENVIO + ", ENV_BOD_ID=" + ENV_BOD_ID + ", ENV_PUER_ID=" + ENV_PUER_ID
				+ ", ENV_FECHA_ENTREGA=" + ENV_FECHA_ENTREGA + ", ENV_CIU_ID=" + ENV_CIU_ID + ", ENV_TRAS_ID="
				+ ENV_TRAS_ID + "]";
	}
	
	
	
	
	
	

	
	
	
}
