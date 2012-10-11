package br.faccamp.domain;

public class Raiz extends Operacao {

	public Raiz(String numero1){
		super(numero1);
		
	}
	
	@Override
	public String calcula(String numero1){
		Double primeiro = new Double(getNumero1());
		Double result = Math.sqrt(primeiro);
		return (result + "");
	}
}
