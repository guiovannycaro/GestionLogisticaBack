package com.gestion.rest.Model;

public class TipoDocumento {
	
	Integer TDOC_ID;
	String TDOC_NOMBRE;
	String TDOC_DESCRIPCION;

	
	public TipoDocumento() {
	}


	public TipoDocumento(Integer tDOC_ID, String tDOC_NOMBRE, String tDOC_DESCRIPCION) {
		TDOC_ID = tDOC_ID;
		TDOC_NOMBRE = tDOC_NOMBRE;
		TDOC_DESCRIPCION = tDOC_DESCRIPCION;
	}


	public Integer getTDOC_ID() {
		return TDOC_ID;
	}


	public void setTDOC_ID(Integer tDOC_ID) {
		TDOC_ID = tDOC_ID;
	}


	public String getTDOC_NOMBRE() {
		return TDOC_NOMBRE;
	}


	public void setTDOC_NOMBRE(String tDOC_NOMBRE) {
		TDOC_NOMBRE = tDOC_NOMBRE;
	}


	public String getTDOC_DESCRIPCION() {
		return TDOC_DESCRIPCION;
	}


	public void setTDOC_DESCRIPCION(String tDOC_DESCRIPCION) {
		TDOC_DESCRIPCION = tDOC_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "TipoDocumento [TDOC_ID=" + TDOC_ID + ", TDOC_NOMBRE=" + TDOC_NOMBRE + ", TDOC_DESCRIPCION="
				+ TDOC_DESCRIPCION + "]";
	}



	
	
	
}
