package com.ali.behavioral.command.example2;

import java.util.List;

public class TratamientoPedidoMultiple implements TratamientoPedido {

	private List<Pedido> pedidos;

	public TratamientoPedidoMultiple(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public boolean tratar() {
		// iterar sobre la lista de pedidos y tratar cada uno
		return true; 
	}
}
