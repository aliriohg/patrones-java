package com.ali.structural.facade.example2;

public class ServicioComunicacion {

	public void setPreferencias (String cliente, PreferenciasComunicacion preferencias) {
		BBDD.INSTANCE.setPreferencias(cliente, preferencias);
	}

}
