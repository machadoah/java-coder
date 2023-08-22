package com.medium.machadoah.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.medium.machadoah.cm.excecao.ExplosaoException;

class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}


	@Test
	void testVizinhoReal() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado); //  Vertifica se resultado == true
	}
	
	@Test
	void testNaoVizinhoReal() {
		Campo vizinho = new Campo(4, 5);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado); //  Vertifica se resultado == true
	}
	
	// ---------------------
	
	@Test
	void testarAlternarMarcacaoMarcado() {
		assertFalse(campo.isMarcado());
	
	}
	@Test
	void testarAlternarMarcacao() {
		campo.alternarMarcacao(); // false -> true
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testarAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao(); // false -> true
		campo.alternarMarcacao(); // true -> false
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao(); // false -> true
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		// Testa o tipo de exception!
		assertThrows(ExplosaoException.class, () -> campo.abrir()); 
	}
	
	// ------------------
	@Test
	void testeAbrirComVizinho1() {
		Campo campo11 = new Campo(1,1);
		Campo campo22 = new Campo(2,2);
	
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo.isAberto() == true && campo11.isAberto() == true);
	}

	@Test
	void testeAbrirComVizinho2() {
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		campo12.minar();
		
		Campo campo22 = new Campo(2,2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() == true && campo11.isAberto() == false);
	}

}
