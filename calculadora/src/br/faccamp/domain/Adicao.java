package br.faccamp.domain;

public class Adicao extends Operacao {

	public Adicao(String numero1) {
		super(numero1);

	}

	public String calcula(String numero2) {
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double(numero2);
		return (primeiro + segundo) + "";

	}

}
