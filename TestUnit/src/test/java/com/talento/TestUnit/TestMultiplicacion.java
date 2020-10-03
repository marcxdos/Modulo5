package com.talento.TestUnit;

import junit.framework.TestCase;

public class TestMultiplicacion extends TestCase {
	
	public void testmultiplicar()  {
		Multiplicacion multiplicacion = new Multiplicacion();
		double resultado = multiplicacion.multiplicar(4.0, 4.0);
		//Verificando que la resta sea correcta
		assertEquals(16.0,resultado);
	}
	
}
