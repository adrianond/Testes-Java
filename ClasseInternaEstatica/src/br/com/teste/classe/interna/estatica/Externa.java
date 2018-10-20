package br.com.teste.classe.interna.estatica;

public class Externa {

	static class Estatica {
		void imprime() {
			System.out.println("método da classe aninhada estática");
		}
	}

	class NaoEstatica {
		void imprime() {
			System.out.println("método da classe aninhada NÃO estática");
		}
	}

}
