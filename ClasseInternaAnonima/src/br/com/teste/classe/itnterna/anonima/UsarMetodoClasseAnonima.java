package br.com.teste.classe.itnterna.anonima;

import java.util.List;
import br.com.teste.classe.itnterna.anonima.conta.Conta;

public class UsarMetodoClasseAnonima {

	public void listaConta(List<Conta> list) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Usando metodo da classe anonima");
		for (Conta conta : list) {
			Conta object = new Conta();
			object.setNumero(conta.getNumero());
			object.setTitular(conta.getTitular());
			System.out.println("Titular: " + object.getTitular() + " Numero: " + object.getNumero());
		}
	}
}
