package com.gestion.rest.Model;

import java.util.Date;

public class Productos {

	Integer PRO_ID;
	
	String PRO_NOMBRES;
	
	String PRO_DESCRIPCION;
	
	String PRO_OBSERVACION;
	
	Double PROD_VALOR;
	
	Double PROD_CANTIDAD;
	
	
	Integer PRO_ESTADO;
	
	public Productos() {
	}

	public Productos(Integer pRO_ID, String pRO_NOMBRES, String pRO_DESCRIPCION, String pRO_OBSERVACION,
			Double pROD_VALOR, Double pROD_CANTIDAD, Integer pRO_ESTADO) {
		super();
		PRO_ID = pRO_ID;
		PRO_NOMBRES = pRO_NOMBRES;
		PRO_DESCRIPCION = pRO_DESCRIPCION;
		PRO_OBSERVACION = pRO_OBSERVACION;
		PROD_VALOR = pROD_VALOR;
		PROD_CANTIDAD = pROD_CANTIDAD;
		PRO_ESTADO = pRO_ESTADO;
	}



	public Integer getPRO_ID() {
		return PRO_ID;
	}

	public void setPRO_ID(Integer pRO_ID) {
		PRO_ID = pRO_ID;
	}

	public String getPRO_NOMBRES() {
		return PRO_NOMBRES;
	}

	public void setPRO_NOMBRES(String pRO_NOMBRES) {
		PRO_NOMBRES = pRO_NOMBRES;
	}

	public String getPRO_DESCRIPCION() {
		return PRO_DESCRIPCION;
	}

	public void setPRO_DESCRIPCION(String pRO_DESCRIPCION) {
		PRO_DESCRIPCION = pRO_DESCRIPCION;
	}

	public String getPRO_OBSERVACION() {
		return PRO_OBSERVACION;
	}

	public void setPRO_OBSERVACION(String pRO_OBSERVACION) {
		PRO_OBSERVACION = pRO_OBSERVACION;
	}



	public Double getPROD_VALOR() {
		return PROD_VALOR;
	}

	public void setPROD_VALOR(Double pROD_VALOR) {
		PROD_VALOR = pROD_VALOR;
	}

	public Double getPROD_CANTIDAD() {
		return PROD_CANTIDAD;
	}

	public void setPROD_CANTIDAD(Double pROD_CANTIDAD) {
		PROD_CANTIDAD = pROD_CANTIDAD;
	}

	public Integer getPRO_ESTADO() {
		return PRO_ESTADO;
	}

	public void setPRO_ESTADO(Integer pRO_ESTADO) {
		PRO_ESTADO = pRO_ESTADO;
	}

	@Override
	public String toString() {
		return "Productos [PRO_ID=" + PRO_ID + ", PRO_NOMBRES=" + PRO_NOMBRES + ", PRO_DESCRIPCION=" + PRO_DESCRIPCION
				+ ", PRO_OBSERVACION=" + PRO_OBSERVACION + ", PROD_VALOR=" + PROD_VALOR + ", PROD_CANTIDAD="
				+ PROD_CANTIDAD + ", PRO_ESTADO=" + PRO_ESTADO + "]";
	}

	
}
