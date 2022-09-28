package com.ali.behavioral.chainofresponsability.example2;

public class Documento {

	private final String tipo;
	private final String contenido;
	
	public Documento(String tipo, String contenido) {
		this.tipo = tipo;
		this.contenido = contenido;
	}
	public String getTipo() {
		return tipo;
	}
	public String getContenido() {
		return contenido;
	}
	
}
