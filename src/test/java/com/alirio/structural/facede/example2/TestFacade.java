package com.alirio.structural.facede.example2;

import static org.junit.Assert.*;

import com.ali.structural.facade.example2.*;
import org.junit.Before;
import org.junit.Test;

public class TestFacade {

	private String nombreCliente = "Antonia";
	private String emailCliente = "antonia@email.com";
	
	@Before
	public void init() {
		BBDD.INSTANCE.clear();
	}
	
	@Test
	public void test_original() {

		ServicioConfiguracion configuracion = new ServicioConfiguracion();
		ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
		ServicioComunicacion comunicacion = new ServicioComunicacion();

		fidelizacion.crearTarjeta(nombreCliente, ServicioFidelizacion.Tipo.BASICA);
		configuracion.addEmail(nombreCliente, emailCliente);
		PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(nombreCliente, preferencias);
		
		compruebaInscripion();
	}
	
	@Test
	public void test_facade() {
		// usa aqui tu servicio facade para dar de alta un usuario
		// con los datos particulares nombreCliente e emailCliente
		new FacadeService().inscripcionExpress(nombreCliente, emailCliente);
		
		compruebaInscripion();
	}

	private void compruebaInscripion() {
		assertEquals(BBDD.INSTANCE.getTarjeta(nombreCliente), ServicioFidelizacion.Tipo.BASICA);
		assertEquals(BBDD.INSTANCE.getEmail(nombreCliente), emailCliente);
		PreferenciasComunicacion preferencias = BBDD.INSTANCE.getPreferencias(nombreCliente);
		assertNotNull(preferencias);
		assertFalse("no recibe email diario", preferencias.isEmailDiario());
		assertTrue("recibe email semanal", preferencias.isEmailSemanal());
		assertTrue("recibe email html", preferencias.isEmailHtml());
	}

}
