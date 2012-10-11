package br.faccamp.domain;

public class MaisOuMenos extends Operacao {

	public MaisOuMenos(String numero1){
		super(numero1);
	}
	@Override
	public String calcula(String numero2){
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double("-1");
		return(primeiro * segundo + "");
		
	}
}

