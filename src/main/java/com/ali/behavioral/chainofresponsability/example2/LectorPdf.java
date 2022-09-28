package com.ali.behavioral.chainofresponsability.example2;

public class LectorPdf implements LectorDocumentos {


	@Override
	public String contenido(Documento documento) {
		return "pdf " + documento.getContenido();
	}

	@Override
	public boolean acepta(Documento documento) {
		return documento.getTipo().equals("pdf");
	}

}
