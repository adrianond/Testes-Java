package br.com.teste.classe.interna.estatica;

public class Externa {

	static class Estatica {
		void imprime() {
			System.out.println("m�todo da classe aninhada est�tica");
		}
	}

	class NaoEstatica {
		void imprime() {
			System.out.println("m�todo da classe aninhada N�O est�tica");
		}
	}

}
