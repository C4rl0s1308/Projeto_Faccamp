package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora {

	private CalculadoraGUI gui;
	private Display display;
	private Operacao operacao;
	private Memoria memoria;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);

	}

	public void processaMC() {
		display.limpa();
		memoria = null;

	}

	public void processaMR() {
		try {
			memoria = new Memoria(memoria.getNumero());
			processaIgualM();
		} catch (Exception e) {
			display.atualiza("####### Erro / MEMORIA VAZIA #######");
		}
	}

	public void processaMS() {
		memoria = new Memoria(display.getConteudo());
		display.limpa();

	}

	public void processaMMais() {
		try {
			memoria.soma(display.getConteudo());
			memoria = new Memoria(memoria.getNumero());
			display.limpa();
		} catch (Exception e) {
			display.atualiza("####### Erro / formato incorreto #######");
		}

	}

	public void processaIgualM() {
		String conteudo = display.getConteudo();
		display.limpa();
		try {
			display.atualiza(memoria.armazena(conteudo));
		} catch (Exception e) {
			display.atualiza("####### Erro / MEMORIA VAZIA #######");
		}
	}

	public void processaMMenos() {
		try {
			memoria.subtracao(display.getConteudo());
			memoria = new Memoria(memoria.getNumero());
			display.limpa();
		} catch (Exception e) {
			display.atualiza("####### Erro / formato incorreto #######");
		}

	}

	public void processaCE() {
		display.limpa();

	}

	public void processaC() {
		display.limpa();
		operacao = null;

	}

	public void processaRaiz() {
		operacao = new Raiz(display.getConteudo());
		display.limpa();
		processaIgual();

	}

	public void processaMaisOuMenos() {
		operacao = new MaisOuMenos(display.getConteudo());
		display.limpa();
		processaIgual();

	}

	public void processaFatorial() {
		operacao = new Fatorial(display.getConteudo());
		display.limpa();
		processaIgual();

	}

	public void processaSete() {
		display.atualiza("7");

	}

	public void processaOito() {
		display.atualiza("8");

	}

	public void processaNove() {
		display.atualiza("9");

	}

	public void processaDivisao() {
		operacao = new Divisao(display.getConteudo());
		display.limpa();
	}

	public void processaPorcentual() {
		try {
			String conteudo = display.getConteudo();
			Double cal = new Double(conteudo);
			Double result = (cal / 100);
			display.limpa();
			display.atualiza(operacao.calcula(result + ""));
		} catch (Exception e) {
			display.atualiza("####### Erro / formato incorreto #######");
		}
	}

	public void processaQuatro() {
		display.atualiza("4");

	}

	public void processaCinco() {
		display.atualiza("5");

	}

	public void processaSeis() {
		display.atualiza("6");

	}

	public void processaVezes() {
		operacao = new Multiplicacao(display.getConteudo());
		display.limpa();

	}

	public void processaUmSobreX() {
		operacao = new Reciproc(display.getConteudo());
		display.limpa();
		processaIgual();

	}

	public void processaUm() {
		display.atualiza("1");

	}

	public void processaDois() {
		display.atualiza("2");

	}

	public void processaTres() {
		display.atualiza("3");

	}

	public void processaMenos() {
		operacao = new Subtracao(display.getConteudo());
		display.limpa();

	}

	public void processaXElevadoY() {
		operacao = new Potenciacao(display.getConteudo());
		display.limpa();

	}

	public void processaZero() {
		display.atualiza("0");

	}

	public void processaVirgula() {
		display.atualizaVirgula(",");

	}

	public void processaIgual() {
		String conteudo = display.getConteudo();
		display.limpa();
		try {
			display.atualiza(operacao.calcula(conteudo));
		} catch (Exception e) {
			display.atualiza("####### Erro / formato incorreto #######");
		}
	}

	public void processaLog() {
		operacao = new Logaritimo(display.getConteudo());
		display.limpa();

	}

	public void processaMais() {
		operacao = new Adicao(display.getConteudo());
		display.limpa();
	}

}
