package com.gestion.rest.Model;

public class Puerto {

	Integer PUE_ID;

	String PUE_NOMBRES;

	String PUE_DIRECCION;
	
	String PUE_TELEFONO;

	String PUE_ID_TIPO;

	Integer PUE_CIUDAD_ID;

	Integer PUE_ZONA_ID;

	Integer PUE_ESTADO;

	public Puerto() {
		
	}

	public Puerto(Integer pUE_ID, String pUE_NOMBRES, String pUE_DIRECCION, String pUE_TELEFONO, String pUE_ID_TIPO,
			Integer pUE_CIUDAD_ID, Integer pUE_ZONA_ID, Integer pUE_ESTADO) {
		super();
		PUE_ID = pUE_ID;
		PUE_NOMBRES = pUE_NOMBRES;
		PUE_DIRECCION = pUE_DIRECCION;
		PUE_TELEFONO = pUE_TELEFONO;
		PUE_ID_TIPO = pUE_ID_TIPO;
		PUE_CIUDAD_ID = pUE_CIUDAD_ID;
		PUE_ZONA_ID = pUE_ZONA_ID;
		PUE_ESTADO = pUE_ESTADO;
	}

	public Integer getPUE_ID() {
		return PUE_ID;
	}

	public void setPUE_ID(Integer pUE_ID) {
		PUE_ID = pUE_ID;
	}

	public String getPUE_NOMBRES() {
		return PUE_NOMBRES;
	}

	public void setPUE_NOMBRES(String pUE_NOMBRES) {
		PUE_NOMBRES = pUE_NOMBRES;
	}

	public String getPUE_DIRECCION() {
		return PUE_DIRECCION;
	}

	public void setPUE_DIRECCION(String pUE_DIRECCION) {
		PUE_DIRECCION = pUE_DIRECCION;
	}

	public String getPUE_TELEFONO() {
		return PUE_TELEFONO;
	}

	public void setPUE_TELEFONO(String pUE_TELEFONO) {
		PUE_TELEFONO = pUE_TELEFONO;
	}

	public String getPUE_ID_TIPO() {
		return PUE_ID_TIPO;
	}

	public void setPUE_ID_TIPO(String pUE_ID_TIPO) {
		PUE_ID_TIPO = pUE_ID_TIPO;
	}

	public Integer getPUE_CIUDAD_ID() {
		return PUE_CIUDAD_ID;
	}

	public void setPUE_CIUDAD_ID(Integer pUE_CIUDAD_ID) {
		PUE_CIUDAD_ID = pUE_CIUDAD_ID;
	}

	public Integer getPUE_ZONA_ID() {
		return PUE_ZONA_ID;
	}

	public void setPUE_ZONA_ID(Integer pUE_ZONA_ID) {
		PUE_ZONA_ID = pUE_ZONA_ID;
	}

	public Integer getPUE_ESTADO() {
		return PUE_ESTADO;
	}

	public void setPUE_ESTADO(Integer pUE_ESTADO) {
		PUE_ESTADO = pUE_ESTADO;
	}

	@Override
	public String toString() {
		return "Puerto [PUE_ID=" + PUE_ID + ", PUE_NOMBRES=" + PUE_NOMBRES + ", PUE_DIRECCION=" + PUE_DIRECCION
				+ ", PUE_TELEFONO=" + PUE_TELEFONO + ", PUE_ID_TIPO=" + PUE_ID_TIPO + ", PUE_CIUDAD_ID=" + PUE_CIUDAD_ID
				+ ", PUE_ZONA_ID=" + PUE_ZONA_ID + ", PUE_ESTADO=" + PUE_ESTADO + "]";
	}

	
}
