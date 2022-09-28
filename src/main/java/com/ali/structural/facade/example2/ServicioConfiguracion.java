package com.ali.structural.facade.example2;


public class ServicioConfiguracion {

	public void addEmail(String cliente, String email) {
		BBDD.INSTANCE.setEmail(cliente, email);
	}

	
}
