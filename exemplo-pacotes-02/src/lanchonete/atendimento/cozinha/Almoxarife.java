package lanchonete.atendimento.cozinha;

public class Almoxarife {
  private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	// Depois de retirar o "public" abaixo, a classe Estabelecimento para de enxergar "entregarIngredientes()", mas a Classe Cozinheiro continua.
	void entregarIngredientes() { 
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
	}
	// Depois de retirar o "public" abaixo, a classe Estabelecimento para de enxergar "trocarGas()", mas a Classe Cozinheiro continua.
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
