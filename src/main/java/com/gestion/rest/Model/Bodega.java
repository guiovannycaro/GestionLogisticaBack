package com.gestion.rest.Model;

public class Bodega {

	Integer BOD_ID;

	String BOD_NOMBRES;

	String BOD_DIRECCION;
	
	String BOD_TELEFONO;

	String BOD_ID_TIPO;

	Integer BOD_CIUDAD_ID;

	Integer BOD_ZONA_ID;

	Integer BOD_ESTADO;

	public Bodega() {
		
	}

	public Bodega(Integer bOD_ID, String bOD_NOMBRES, String bOD_DIRECCION, String bOD_TELEFONO, String bOD_ID_TIPO,
			Integer bOD_CIUDAD_ID, Integer bOD_ZONA_ID, Integer bOD_ESTADO) {
		super();
		BOD_ID = bOD_ID;
		BOD_NOMBRES = bOD_NOMBRES;
		BOD_DIRECCION = bOD_DIRECCION;
		BOD_TELEFONO = bOD_TELEFONO;
		BOD_ID_TIPO = bOD_ID_TIPO;
		BOD_CIUDAD_ID = bOD_CIUDAD_ID;
		BOD_ZONA_ID = bOD_ZONA_ID;
		BOD_ESTADO = bOD_ESTADO;
	}

	public Integer getBOD_ID() {
		return BOD_ID;
	}

	public void setBOD_ID(Integer bOD_ID) {
		BOD_ID = bOD_ID;
	}

	public String getBOD_NOMBRES() {
		return BOD_NOMBRES;
	}

	public void setBOD_NOMBRES(String bOD_NOMBRES) {
		BOD_NOMBRES = bOD_NOMBRES;
	}

	public String getBOD_DIRECCION() {
		return BOD_DIRECCION;
	}

	public void setBOD_DIRECCION(String bOD_DIRECCION) {
		BOD_DIRECCION = bOD_DIRECCION;
	}

	public String getBOD_TELEFONO() {
		return BOD_TELEFONO;
	}

	public void setBOD_TELEFONO(String bOD_TELEFONO) {
		BOD_TELEFONO = bOD_TELEFONO;
	}

	public String getBOD_ID_TIPO() {
		return BOD_ID_TIPO;
	}

	public void setBOD_ID_TIPO(String bOD_ID_TIPO) {
		BOD_ID_TIPO = bOD_ID_TIPO;
	}

	public Integer getBOD_CIUDAD_ID() {
		return BOD_CIUDAD_ID;
	}

	public void setBOD_CIUDAD_ID(Integer bOD_CIUDAD_ID) {
		BOD_CIUDAD_ID = bOD_CIUDAD_ID;
	}

	public Integer getBOD_ZONA_ID() {
		return BOD_ZONA_ID;
	}

	public void setBOD_ZONA_ID(Integer bOD_ZONA_ID) {
		BOD_ZONA_ID = bOD_ZONA_ID;
	}

	public Integer getBOD_ESTADO() {
		return BOD_ESTADO;
	}

	public void setBOD_ESTADO(Integer bOD_ESTADO) {
		BOD_ESTADO = bOD_ESTADO;
	}

	@Override
	public String toString() {
		return "Bodega [BOD_ID=" + BOD_ID + ", BOD_NOMBRES=" + BOD_NOMBRES + ", BOD_DIRECCION=" + BOD_DIRECCION
				+ ", BOD_TELEFONO=" + BOD_TELEFONO + ", BOD_ID_TIPO=" + BOD_ID_TIPO + ", BOD_CIUDAD_ID=" + BOD_CIUDAD_ID
				+ ", BOD_ZONA_ID=" + BOD_ZONA_ID + ", BOD_ESTADO=" + BOD_ESTADO + "]";
	}

	
}
