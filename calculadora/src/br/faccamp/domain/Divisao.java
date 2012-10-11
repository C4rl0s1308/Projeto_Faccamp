package br.faccamp.domain;

public class Divisao extends Operacao {

	public Divisao(String numero1) {
		super(numero1);
	}

	@Override
	public String calcula(String numero2) {
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double(numero2);
		if(segundo == 0)
			return ("####### Erro / divisão por zero #######");{
		return (primeiro / segundo + "");
		}
	}
}
