package br.faccamp.domain;

public class Potenciacao extends Operacao {

	public Potenciacao(String numero1) {
		super(numero1);
	}

	@Override
	public String calcula(String numero2) {
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double(numero2);
		Double result = Math.pow(primeiro, segundo);
		return (result + "");
	}

}
