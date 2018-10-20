package br.com.teste.interna.collections;

import java.util.List;

import br.com.teste.interna.collections.Externa.Interna;

public class UsarClasseInterna {

	public static void main(String[] args) {

		Externa externa = new Externa();
		Interna interna = externa.new Interna();

		interna.retornaLista();

		imrimeListaOrdenada(interna.retornaLista());
	}

	private static void imrimeListaOrdenada(List<Conta> retornaLista) {

		for (Conta conta : retornaLista) {
			Conta object = new Conta();
			object.setNumero(conta.getNumero());
			object.setTitular(conta.getTitular());
			System.out.println("Titular: " + object.getTitular() + " Numero: " + object.getNumero());
		}

	}

}
