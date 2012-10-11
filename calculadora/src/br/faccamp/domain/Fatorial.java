package br.faccamp.domain;

public class Fatorial extends Operacao {

	public Fatorial(String numero1) {
		super(numero1);
	}

	@Override
	public String calcula(String numero1) {
		Double primeiro = new Double(getNumero1());
		Double result = 1.0;
		if (primeiro < 0) {
			return ("###### ERRO / número negativo ######");
		}

		if (primeiro == 0) {
			result = 1.0;
		}

		if (primeiro > 0) {
			for (int i = 1; i <= primeiro; i++) {
				result *= i;
			}
		}
		return (result + "");
	}
}
