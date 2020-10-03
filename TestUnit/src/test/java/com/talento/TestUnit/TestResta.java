package com.talento.TestUnit;

import junit.framework.TestCase;

public class TestResta extends TestCase {

	public void testrestar()  {
		Resta resta = new Resta();
		double resultado = resta.restar(2.0, 1.0);
		//Verificando que la resta sea correcta
		assertEquals(1.0,resultado);
	}
}
