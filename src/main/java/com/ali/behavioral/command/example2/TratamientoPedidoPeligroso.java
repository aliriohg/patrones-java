package com.ali.behavioral.command.example2;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

	private PedidoPeligroso pedido;

	public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
		this.pedido = pedido;
	}


	public boolean tratar() {
		// tratar el pedido segun las instrucciones
		return true; // si es false ... :-( 
	}
}
