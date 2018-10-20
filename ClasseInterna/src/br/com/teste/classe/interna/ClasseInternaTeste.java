package br.com.teste.classe.interna;

import br.com.teste.classe.interna.PessoaA.DataAtual;
import br.com.teste.classe.interna.PessoaA.PessoaB;

public class ClasseInternaTeste {
	
	public static void main(String[] args) {
		PessoaA pessoaA = new PessoaA();
		pessoaA.imprimir();

		PessoaB pessoaB = pessoaA.new PessoaB();
		pessoaB.imprimir();

		DataAtual date = pessoaA.new DataAtual();
		System.out.println("data atual: " + date.dataAtual());
	}

}
