package br.com.teste.classe.interna.estatica;

public class ClasseInternaEstaticaTeste {

	public static void main(String[] args) {
		/*
		 * repare que para criar uma instancia da classe estatica não foi
		 * necessário criar uma instância da classe Externa
		 */
		Externa.Estatica estatica = new Externa.Estatica();
		estatica.imprime();

		/*
		 * não é possível criar uma classe não estática sem uma instancia da
		 * classe Externa
		 */
		// Externa.NaoEstatica naoEstatica = new Externa.NaoEstatica();
		// //ERRADO!!!
		Externa externa = new Externa();
		Externa.NaoEstatica naoEstatica = externa.new NaoEstatica();
		naoEstatica.imprime();
	}
}
