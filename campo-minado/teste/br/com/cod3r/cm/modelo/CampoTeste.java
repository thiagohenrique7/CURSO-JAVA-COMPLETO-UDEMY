package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.execao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo (3,3);
	}
	@Test
	void testeVizinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo (3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeVizinhoRealDistancia1Direita() {
		Campo vizinho = new Campo (3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeVizinhoRealDistancia1Emcima() {
		Campo vizinho = new Campo (2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeVizinhoRealDistancia1Embaixo() {
		Campo vizinho = new Campo (4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeVizinhoRealDistancia2() {
		Campo vizinho = new Campo (2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo (1,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
			
	}
	@Test
	void testeValorPadraoMarcado () {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao () {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas () {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAbrirNaoMinadoNaoMarcado () {
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirNaoMinadoMarcado () {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoMarcado () {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoNaoMarcado () {
		campo.minar();
		assertThrows(ExplosaoException.class,() -> {
			campo.abrir();
		});
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirComVizinho () {
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isAberto());
		
	}
	@Test
	void testeAbrirComVizinho2 () {
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		campo12.minar();
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isFechado());
		
	}
	@Test 
	void testeObjetivoAlcancado(){
		
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		campo22.minar();
		campo22.marcar();
		
		campo22.adicionarVizinho(campo11);
		
		campo22.abrir();
		assertTrue(campo22.objetivoAlcançado());
		
	}
	@Test 
	void testeObjetivoAlcancado2(){
		
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		
		campo22.adicionarVizinho(campo11);
		
		campo22.abrir();
		assertTrue(campo22.objetivoAlcançado());
		
	}
	@Test 
	void testeObjetivoAlcancado3(){
		
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		campo22.minar();
		campo22.adicionarVizinho(campo11);
		
//		campo22.abrir();
		assertThrows(ExplosaoException.class,() -> {
			campo22.abrir();
		});
		assertFalse(campo22.objetivoAlcançado());
		
	}
	@Test
	void testeMinasNaVizinhanca() {
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.minar();
		campo11.minar();
		
//		campo22.abrir();
		assertTrue(campo22.minasNaVizinhança()>0);
	}
	
}
