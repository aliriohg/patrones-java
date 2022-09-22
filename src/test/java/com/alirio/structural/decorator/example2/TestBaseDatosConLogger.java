package com.alirio.structural.decorator.example2;


import com.ali.structural.decorator.example2.BaseDatos;
import com.ali.structural.decorator.example2.BaseDatosMemoria;
import com.ali.structural.decorator.example2.Logger;
import com.ali.structural.decorator.example2.LoggerDecorator;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestBaseDatosConLogger {

	private Logger logger = new Logger();
	private BaseDatos sinLogger = new BaseDatosMemoria();
	
	private BaseDatos bbdd;
	
	@Before
	public void init() {
		
		// construimos un decorator a la base de datos que usara el mecanismo de logging logger.
		// Estos son los dos parametros necesarios para la construccion del decorator.
		// Fijaos como el tipo devuelto se asigna a una variable del tipo BaseDatos: el cliente
		// no necesita saber (una vez hecha la creación) que está trabajando con un decorator.
		bbdd = new LoggerDecorator(logger, sinLogger);
	}
	
	
	// de este test no hay que modificar nada
	@Test
	public void test_logger_decorator() {
		
		assertFalse("logger no esta vacio",logger.obtener().contains("inserta entrada"));
		bbdd.inserta("entrada");
		
		assertTrue("bbdd no ha recibido entrada", sinLogger.registros().contains("entrada"));
		assertTrue("no se ha registrado la entrada", logger.obtener().contains("inserta entrada"));

		// lectura con el adapter con logger
		List<String> registros = bbdd.registros();
		
		assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));
	
		assertTrue("no se ha registrado la lectura", logger.obtener().contains("lectura"));
	}

	
}
