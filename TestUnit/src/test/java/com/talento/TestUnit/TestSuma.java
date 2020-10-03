package com.talento.TestUnit;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class TestSuma extends TestCase{

	public void testSumar() {
		Suma suma=new Suma();
		double resultado = suma.sumar(1.0, 1.0);
		assertEquals(2.0, resultado);
	}
}
