package com.ali.behavioral.command.example2;

public class Oficina {

	
	public void recibe (TratamientoPedido pedido) {
		System.out.println("registrando pedido");
		
        boolean ok = pedido.tratar(); 
        
		System.out.println("registrar si ha ido bien");
	}
	
}
