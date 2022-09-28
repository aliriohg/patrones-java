package com.ali.structural.facade.example2;

public class ServicioFidelizacion {

	public enum Tipo { BASICA, PREMIUM, VIP }
	
	public void crearTarjeta(String cliente, Tipo tipo) {
		BBDD.INSTANCE.addTarjeta(cliente, tipo);
	}

}
