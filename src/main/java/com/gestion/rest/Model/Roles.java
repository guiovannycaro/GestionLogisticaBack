package com.gestion.rest.Model;

public class Roles {

	Integer ROL_ID;
	String ROL_NOMBRE;
	String ROL_DESCRIPCION;

	public Roles() {
	}

	public Roles(Integer rOL_ID, String rOL_NOMBRE, String rOL_DESCRIPCION) {
		ROL_ID = rOL_ID;
		ROL_NOMBRE = rOL_NOMBRE;
		ROL_DESCRIPCION = rOL_DESCRIPCION;
	}

	public Integer getROL_ID() {
		return ROL_ID;
	}

	public void setROL_ID(Integer rOL_ID) {
		ROL_ID = rOL_ID;
	}

	public String getROL_NOMBRE() {
		return ROL_NOMBRE;
	}

	public void setROL_NOMBRE(String rOL_NOMBRE) {
		ROL_NOMBRE = rOL_NOMBRE;
	}

	public String getROL_DESCRIPCION() {
		return ROL_DESCRIPCION;
	}

	public void setROL_DESCRIPCION(String rOL_DESCRIPCION) {
		ROL_DESCRIPCION = rOL_DESCRIPCION;
	}

	@Override
	public String toString() {
		return "Roles [ROL_ID=" + ROL_ID + ", ROL_NOMBRE=" + ROL_NOMBRE + ", ROL_DESCRIPCION=" + ROL_DESCRIPCION + "]";
	}


	

	

}
