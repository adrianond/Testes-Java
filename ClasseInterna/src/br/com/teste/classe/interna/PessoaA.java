package br.com.teste.classe.interna;

import java.util.Date;

/**
 * We can use Inner Class when we have a scenario that one class is used for only another class.
 * So, we can create this Inner Class and provide its behavior to be used for Outer Class
 * @author 660454
 *
 */
public class PessoaA {

	private String nome = "adriano";
	private String sobreNome = "dantas";

	public void imprimir() {
		System.out.println("Metodo  da classe PessoaA: " + nome);
	}

	private void teste() {
		System.out.println("Metodo  da classe PessoaA");
	}

	public class PessoaB {

		private String nome = "Paulo";

		public void imprimir() {
			System.out.println("Metodo  da classe PessoaB: " + nome);
			System.out.println("Metodo  da classe PessoaB: " + sobreNome);
			System.out.println("Acessa o atributo da classe externa " + PessoaA.this.nome);
			teste();
		}

	}

	public class DataAtual {

		public Date dataAtual() {
			Date date = new Date();
			return date;
		}
	}
}
