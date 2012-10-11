package br.faccamp.domain;

public class Multiplicacao extends Operacao {

	public Multiplicacao(String numero1) {
		super(numero1);
	}

	@Override
	public String calcula(String numero2) {
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double(numero2);
		return (primeiro * segundo + "");
	}

}
