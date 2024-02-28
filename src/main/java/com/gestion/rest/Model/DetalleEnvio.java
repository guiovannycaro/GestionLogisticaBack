package com.gestion.rest.Model;

public class DetalleEnvio {
	
Integer ENVD_ID;

Integer  ENVD_PROD_ID;

 double ENVD_CANTIDAD;
 
 double ENVD_PRECIO;
 
 double ENVD_SUBTOTAL;
 
 double ENVD_IVA;
 
 double ENVD_TOTAL;
 
 double ENVD_DESCUENTO;
 
 Integer  ENVD_ENV_ID;

 public DetalleEnvio() {
	
	}
	 
public DetalleEnvio(Integer eNVD_ID, Integer eNVD_PROD_ID, double eNVD_CANTIDAD, double eNVD_PRECIO,
		double eNVD_SUBTOTAL, double eNVD_IVA, double eNVD_TOTAL, double eNVD_DESCUENTO, Integer eNVD_ENV_ID) {
	ENVD_ID = eNVD_ID;
	ENVD_PROD_ID = eNVD_PROD_ID;
	ENVD_CANTIDAD = eNVD_CANTIDAD;
	ENVD_PRECIO = eNVD_PRECIO;
	ENVD_SUBTOTAL = eNVD_SUBTOTAL;
	ENVD_IVA = eNVD_IVA;
	ENVD_TOTAL = eNVD_TOTAL;
	ENVD_DESCUENTO = eNVD_DESCUENTO;
	ENVD_ENV_ID = eNVD_ENV_ID;
}

public Integer getENVD_ID() {
	return ENVD_ID;
}

public void setENVD_ID(Integer eNVD_ID) {
	ENVD_ID = eNVD_ID;
}

public Integer getENVD_PROD_ID() {
	return ENVD_PROD_ID;
}

public void setENVD_PROD_ID(Integer eNVD_PROD_ID) {
	ENVD_PROD_ID = eNVD_PROD_ID;
}

public double getENVD_CANTIDAD() {
	return ENVD_CANTIDAD;
}

public void setENVD_CANTIDAD(double eNVD_CANTIDAD) {
	ENVD_CANTIDAD = eNVD_CANTIDAD;
}

public double getENVD_PRECIO() {
	return ENVD_PRECIO;
}

public void setENVD_PRECIO(double eNVD_PRECIO) {
	ENVD_PRECIO = eNVD_PRECIO;
}

public double getENVD_SUBTOTAL() {
	return ENVD_SUBTOTAL;
}

public void setENVD_SUBTOTAL(double eNVD_SUBTOTAL) {
	ENVD_SUBTOTAL = eNVD_SUBTOTAL;
}

public double getENVD_IVA() {
	return ENVD_IVA;
}

public void setENVD_IVA(double eNVD_IVA) {
	ENVD_IVA = eNVD_IVA;
}

public double getENVD_TOTAL() {
	return ENVD_TOTAL;
}

public void setENVD_TOTAL(double eNVD_TOTAL) {
	ENVD_TOTAL = eNVD_TOTAL;
}

public double getENVD_DESCUENTO() {
	return ENVD_DESCUENTO;
}

public void setENVD_DESCUENTO(double eNVD_DESCUENTO) {
	ENVD_DESCUENTO = eNVD_DESCUENTO;
}

public Integer getENVD_ENV_ID() {
	return ENVD_ENV_ID;
}

public void setENVD_ENV_ID(Integer eNVD_ENV_ID) {
	ENVD_ENV_ID = eNVD_ENV_ID;
}

@Override
public String toString() {
	return "DetalleEnvio [ENVD_ID=" + ENVD_ID + ", ENVD_PROD_ID=" + ENVD_PROD_ID + ", ENVD_CANTIDAD=" + ENVD_CANTIDAD
			+ ", ENVD_PRECIO=" + ENVD_PRECIO + ", ENVD_SUBTOTAL=" + ENVD_SUBTOTAL + ", ENVD_IVA=" + ENVD_IVA
			+ ", ENVD_TOTAL=" + ENVD_TOTAL + ", ENVD_DESCUENTO=" + ENVD_DESCUENTO + ", ENVD_ENV_ID=" + ENVD_ENV_ID
			+ "]";
}
 

 
 
 
}
