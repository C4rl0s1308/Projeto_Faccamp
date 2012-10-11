package br.faccamp.domain;

public class Memoria {

	private String numero;

	public Memoria(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;

	}

	public String armazena(String conteudo) {
		numero = (getNumero());
		return (numero);
	}

	public String soma(String conteudo) {
		numero = (getNumero());
		Double primeiro = new Double(numero);
		Double segundo = new Double(conteudo);
		primeiro += segundo;
		numero = (primeiro + "");
		return (numero);
	}

	public String subtracao(String conteudo) {
		numero = (getNumero());
		Double primeiro = new Double(numero);
		Double segundo = new Double(conteudo);
		primeiro -= segundo;
		numero = (primeiro + "");
		return numero;
	}
}