package com.spring.project.dto;

import java.io.Serializable;

public class BuyDTO implements Serializable {

	String nombreTitular;
    String numeroTarjeta;
    String mesCaducidad;
    String yearCaducidad;
    String cvv;
    String emisor;
    String concepto;
    String cantidad;
    
    
	public BuyDTO() {
		super();
	}
	public BuyDTO(String nombreTitular, String numeroTarjeta, String mesCaducidad, String yearCaducidad, String cvv,
			String emisor, String concepto, String cantidad) {
		super();
		this.nombreTitular = nombreTitular;
		this.numeroTarjeta = numeroTarjeta;
		this.mesCaducidad = mesCaducidad;
		this.yearCaducidad = yearCaducidad;
		this.cvv = cvv;
		this.emisor = emisor;
		this.concepto = concepto;
		this.cantidad = cantidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getMesCaducidad() {
		return mesCaducidad;
	}
	public void setMesCaducidad(String mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}
	public String getYearCaducidad() {
		return yearCaducidad;
	}
	public void setYearCaducidad(String yearCaducidad) {
		this.yearCaducidad = yearCaducidad;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "BuyDTO [nombreTitular=" + nombreTitular + ", numeroTarjeta=" + numeroTarjeta + ", mesCaducidad="
				+ mesCaducidad + ", yearCaducidad=" + yearCaducidad + ", cvv=" + cvv + ", emisor=" + emisor
				+ ", concepto=" + concepto + ", cantidad=" + cantidad + "]";
	}
	
    
}
