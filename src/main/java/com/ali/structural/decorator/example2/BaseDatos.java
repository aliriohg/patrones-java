package com.ali.structural.decorator.example2;

import java.util.List;

public interface BaseDatos {

	void inserta (String registro);
	
	List<String> registros();
}
