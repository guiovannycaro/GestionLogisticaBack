package com.gestion.rest.Model;

public class TipoProducto {
	
	Integer TIPOPR_ID;
	String TIPOPR_NOMBRE;
	String TIPOPR_DESCRIPCION;

	
	public TipoProducto() {
	}


	public TipoProducto(Integer tIPOPR_ID, String tIPOPR_NOMBRE, String tIPOPR_DESCRIPCION) {
		super();
		TIPOPR_ID = tIPOPR_ID;
		TIPOPR_NOMBRE = tIPOPR_NOMBRE;
		TIPOPR_DESCRIPCION = tIPOPR_DESCRIPCION;
	}


	public Integer getTIPOPR_ID() {
		return TIPOPR_ID;
	}


	public void setTIPOPR_ID(Integer tIPOPR_ID) {
		TIPOPR_ID = tIPOPR_ID;
	}


	public String getTIPOPR_NOMBRE() {
		return TIPOPR_NOMBRE;
	}


	public void setTIPOPR_NOMBRE(String tIPOPR_NOMBRE) {
		TIPOPR_NOMBRE = tIPOPR_NOMBRE;
	}


	public String getTIPOPR_DESCRIPCION() {
		return TIPOPR_DESCRIPCION;
	}


	public void setTIPOPR_DESCRIPCION(String tIPOPR_DESCRIPCION) {
		TIPOPR_DESCRIPCION = tIPOPR_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "TipoProducto [TIPOPR_ID=" + TIPOPR_ID + ", TIPOPR_NOMBRE=" + TIPOPR_NOMBRE + ", TIPOPR_DESCRIPCION="
				+ TIPOPR_DESCRIPCION + "]";
	}
	
	
	
	
}
