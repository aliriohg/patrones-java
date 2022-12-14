package com.alirio.structural.adapter.example2;

import com.ali.structural.adapter.example2.BancoNostrumIml;
import com.ali.structural.adapter.example2.InternationalMoneyAdapter;
import com.ali.structural.adapter.example2.InternationalMoneyOrganization;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternationMoneyTests {

	private InternationalMoneyOrganization servicio;
	
	@Before
	public void init() {
		// cambia este null por una referencia al adapter que has creado
		
		// asignamos a servicio un adapter asociado a una implementacion del
		// servicio original
		servicio = new InternationalMoneyAdapter(new BancoNostrumIml());
	}
	
	@Test
	public void test_cliente_no_existe() {
		Assert.assertEquals(0,servicio.state("No_existo"));
	}

	@Test
	public void test_operaciones_con_nuevo_cliente() {
		String cliente = "nuevo";
		servicio.transfer(100, cliente);
		Assert.assertEquals(100, servicio.state(cliente));
		servicio.transfer(-70, cliente);
		Assert.assertEquals(30, servicio.state(cliente));
	}
}
