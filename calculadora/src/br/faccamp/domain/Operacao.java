package br.faccamp.domain;

public abstract class Operacao {
	
	private String numero1;
	        
	public abstract String calcula(String conteudo);
	
	public Operacao(String numero1) {
		this.numero1 = numero1;
	}
		
	public String getNumero1() {
		return numero1;
		
	}
		}
		
	

