package br.faccamp.test;

public class OperacaoTeste {
	
	public static String Adicao(double primeiro, double segundo) {
		return (primeiro + segundo) + "";
	}

	public static String Subtracao(double primeiro, double segundo) {
		return (primeiro - segundo) + "";
	}
	
	public static String Raiz(double primeiro) {
		Double result = Math.sqrt(primeiro);
		return (result + "");
	}
}
