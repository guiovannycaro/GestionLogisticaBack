package com.gestion.rest.Model;

public class TipoBodega {
	
	Integer TIPOB_ID;
	String TIPOB_NOMBRE;
	String TIPOB_DESCRIPCION;
	
	
	public TipoBodega() {
	}


	public TipoBodega(Integer tIPOB_ID, String tIPOB_NOMBRE, String tIPOB_DESCRIPCION) {
		super();
		TIPOB_ID = tIPOB_ID;
		TIPOB_NOMBRE = tIPOB_NOMBRE;
		TIPOB_DESCRIPCION = tIPOB_DESCRIPCION;
	}


	public Integer getTIPOB_ID() {
		return TIPOB_ID;
	}


	public void setTIPOB_ID(Integer tIPOB_ID) {
		TIPOB_ID = tIPOB_ID;
	}


	public String getTIPOB_NOMBRE() {
		return TIPOB_NOMBRE;
	}


	public void setTIPOB_NOMBRE(String tIPOB_NOMBRE) {
		TIPOB_NOMBRE = tIPOB_NOMBRE;
	}


	public String getTIPOB_DESCRIPCION() {
		return TIPOB_DESCRIPCION;
	}


	public void setTIPOB_DESCRIPCION(String tIPOB_DESCRIPCION) {
		TIPOB_DESCRIPCION = tIPOB_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "TipoBodega [TIPOB_ID=" + TIPOB_ID + ", TIPOB_NOMBRE=" + TIPOB_NOMBRE + ", TIPOB_DESCRIPCION="
				+ TIPOB_DESCRIPCION + "]";
	}
	
	
	
}
