package com.ali.structural.bridge.example2;

/**
 * Implementation API : captura lo que tienen en comun todas las implementaciones existentes
 */
public interface TiendaImpl {

	public String descripcionProducto(String producto);
	
	void compraProducto (String nombre, int cantidad); 

	void compraCaja (String nombre, int numeroProductosEnCaja);
}
