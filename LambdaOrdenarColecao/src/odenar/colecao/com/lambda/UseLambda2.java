package odenar.colecao.com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseLambda2 {

	public static void main(String[] args) {
		Conta conta = new Conta("Carlos", 9);
		Conta conta2 = new Conta("Adriano", 2);
		Conta conta3 = new Conta("Bruno", 7);
		Conta conta4 = new Conta("Fernando", 4);
		Conta conta5 = new Conta("Fernando", 4);
		
		List<Conta> lista = Arrays.asList(conta, conta2, conta3, conta4, conta5);

		System.out.println("Lista não ordenada:");
		System.out.println(lista);
		System.out.println("--------------------------------------------------------------------------");
		
		

		imprimeLista(lista);
		System.out.println("--------------------------------------------------------------------------");
		imprimeListaForEach(lista);
		System.out.println("--------------------------------------------------------------------------");
		objetosConta(lista);
	}

	private static void objetosConta(List<Conta> lista) {

		System.out.println("Objeto conta ordenado em ordem alfabética");
		// lambda que ordena a lista por ordem alfabética
		lista.sort((c1, c2) -> c1.getTitular().compareTo(c2.getTitular()));
		
		// lambda para percorrer lista
		lista.forEach((Conta c) -> {
			Conta conta = new Conta();
			conta.setTitular(c.getTitular());
			conta.setNumero(c.getNumero());
			System.out.println("Titular: " + c.getTitular() + " da conta " + c.getNumero());
		});
	}

	private static void imprimeListaForEach(List<Conta> lista) {

		System.out.println("Lista ordenada por ordem alfabética usando forEach:");
		// lambda que ordena a lista por ordem alfabética
		lista.sort((c1, c2) -> c1.getTitular().compareTo(c2.getTitular()));
		
		// lambda para percorrer lista
		System.out.println("Imprime o titular da conta:");
		lista.forEach(c -> System.out.println(c.getTitular()));
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Lista ordenada por numérica usando forEach:");
		// lambda que ordena a lista por ordem numérica
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		// lambda para percorrer lista
		lista.forEach(c -> System.out.println(c.getNumero()));
	}

	private static <T> void imprimeLista(List<Conta> lista) {
		// lambda que ordena a lista por ordem alfabética
		lista.sort((c1, c2) -> c1.getTitular().compareTo(c2.getTitular()));

		System.out.println("Lista ordenada por ordem alfabética:");
		System.out.println(lista);
		System.out.println("--------------------------------------------------------------------------");
		
		// lambda que ordena a lista por tamanho da String(imprime a lista, pois a classe conta sobscreveu toString())
		lista.sort((c1, c2) -> Integer.compare(c1.getTitular().length(), c2.getTitular().length()));
		System.out.println("Lista ordenada por tamanho String:");
		System.out.println(lista);
		
		// lambda que ordena a lista por ordem numerica(imprime a lista, pois a classe conta sobscreveu toString())
		System.out.println("--------------------------------------------------------------------------");
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		System.out.println("Lista ordenada por ordem numérica:");
		System.out.println(lista);
	}

}
