package br.faccamp.test;

import junit.framework.TestCase;

public class CalculoTeste extends TestCase{

	public void TesteCalculaAdicao(){
		double primeiro = 20;
		double segundo = 10;
		String RetornaEsperado = "30.0";
		
		String Retorno = OperacaoTeste.Adicao( primeiro, segundo);
		assertEquals(RetornaEsperado, Retorno);
	}
	
	public void testeCalculaSubtracao(){
		double primeiro = 100;
		double segundo = 40;
		String RetornaEsperado = "60.0";
		
		String Retorno = OperacaoTeste.Subtracao( primeiro, segundo);
		assertEquals(RetornaEsperado, Retorno);
	}
	
	public void testeCalculaRaiz(){
		double primeiro = 4;
		String RetornaEsperado = "2.0";
		
		String Retorno = OperacaoTeste.Raiz( primeiro);
		assertEquals(RetornaEsperado, Retorno);
	}
}
