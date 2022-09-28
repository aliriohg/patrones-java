package com.ali.behavioral.chainofresponsability.example2;

public class LectorDoc implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "doc " + documento.getContenido();
	}

	@Override
	public boolean acepta(Documento documento) {
		return documento.getTipo().equals("doc");
	}

}
