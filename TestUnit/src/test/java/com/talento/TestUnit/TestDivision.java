package com.talento.TestUnit;

import junit.framework.TestCase;

public class TestDivision extends TestCase{

	public void testdividir()  {
	Division division = new Division();
	double resultado = division.dividir(16.0, 4.0);
	//Verificando que la resta sea correcta
	assertEquals(4.0,resultado);
	}
	
}
