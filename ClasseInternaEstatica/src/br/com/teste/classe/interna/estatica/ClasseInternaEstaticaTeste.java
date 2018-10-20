package br.com.teste.classe.interna.estatica;

public class ClasseInternaEstaticaTeste {

	public static void main(String[] args) {
		/*
		 * repare que para criar uma instancia da classe estatica n�o foi
		 * necess�rio criar uma inst�ncia da classe Externa
		 */
		Externa.Estatica estatica = new Externa.Estatica();
		estatica.imprime();

		/*
		 * n�o � poss�vel criar uma classe n�o est�tica sem uma instancia da
		 * classe Externa
		 */
		// Externa.NaoEstatica naoEstatica = new Externa.NaoEstatica();
		// //ERRADO!!!
		Externa externa = new Externa();
		Externa.NaoEstatica naoEstatica = externa.new NaoEstatica();
		naoEstatica.imprime();
	}
}
