package com.medium.machadoah.cm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		int a = 1 + 1;
		assertEquals(2, a); 
		// Verifique se o valor de A corresponde ao 2 que deve ser a resposta!
	}
	
	@Test
	void testarIgualANove() {
		int b = (int) Math.pow(3, 2);
		assertEquals(9, b);
	}

}
