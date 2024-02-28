package com.gestion.rest.Model;

public class TipoPuerto {
	
	Integer TIPOP_ID;
	String TIPOP_NOMBRE;
	String TIPOP_DESCRIPCION;

	
	public TipoPuerto() {
	}
	
	public TipoPuerto(Integer tIPOP_ID, String tIPOP_NOMBRE, String tIPOP_DESCRIPCION) {
		TIPOP_ID = tIPOP_ID;
		TIPOP_NOMBRE = tIPOP_NOMBRE;
		TIPOP_DESCRIPCION = tIPOP_DESCRIPCION;
		
	}

	public Integer getTIPOP_ID() {
		return TIPOP_ID;
	}

	public void setTIPOP_ID(Integer tIPOP_ID) {
		TIPOP_ID = tIPOP_ID;
	}

	public String getTIPOP_NOMBRE() {
		return TIPOP_NOMBRE;
	}

	public void setTIPOP_NOMBRE(String tIPOP_NOMBRE) {
		TIPOP_NOMBRE = tIPOP_NOMBRE;
	}

	public String getTIPOP_DESCRIPCION() {
		return TIPOP_DESCRIPCION;
	}

	public void setTIPOP_DESCRIPCION(String tIPOP_DESCRIPCION) {
		TIPOP_DESCRIPCION = tIPOP_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "TipoProducto [TIPOP_ID=" + TIPOP_ID + ", TIPOP_NOMBRE=" + TIPOP_NOMBRE + ", TIPOP_DESCRIPCION="
				+ TIPOP_DESCRIPCION + "]";
	}
	
	
}
