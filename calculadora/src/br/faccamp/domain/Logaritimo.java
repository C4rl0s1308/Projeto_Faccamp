package br.faccamp.domain;

public class Logaritimo extends Operacao {
	
	public Logaritimo(String numero1){
		super (numero1);
		
		 
	}

	@Override
	public String calcula(String numero2){
		Double primeiro = new Double(getNumero1());
		Double segundo = new Double(numero2);
		Double result = Math.log10(primeiro) / Math.log10(segundo);
		return (result + "");
	}
	
}
