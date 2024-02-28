package com.gestion.rest.Model;

public class TipoVehiculo {
	
	Integer TIPOV_ID;
	String TIPOV_NOMBRE;
	String TIPOV_DESCRIPCION;

	
	public TipoVehiculo() {
	}


	public TipoVehiculo(Integer tIPOV_ID, String tIPOV_NOMBRE, String tIPOV_DESCRIPCION) {
		super();
		TIPOV_ID = tIPOV_ID;
		TIPOV_NOMBRE = tIPOV_NOMBRE;
		TIPOV_DESCRIPCION = tIPOV_DESCRIPCION;
	}


	public Integer getTIPOV_ID() {
		return TIPOV_ID;
	}


	public void setTIPOV_ID(Integer tIPOV_ID) {
		TIPOV_ID = tIPOV_ID;
	}


	public String getTIPOV_NOMBRE() {
		return TIPOV_NOMBRE;
	}


	public void setTIPOV_NOMBRE(String tIPOV_NOMBRE) {
		TIPOV_NOMBRE = tIPOV_NOMBRE;
	}


	public String getTIPOV_DESCRIPCION() {
		return TIPOV_DESCRIPCION;
	}


	public void setTIPOV_DESCRIPCION(String tIPOV_DESCRIPCION) {
		TIPOV_DESCRIPCION = tIPOV_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "TipoVehiculo [TIPOV_ID=" + TIPOV_ID + ", TIPOV_NOMBRE=" + TIPOV_NOMBRE + ", TIPOV_DESCRIPCION="
				+ TIPOV_DESCRIPCION + "]";
	}


	
	
	
}
