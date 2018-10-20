package teste.metod.reference.conta;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MetodReferenceTest {

	public static void main(String[] args) {
		Conta conta = new Conta("Carlos", 9);
		Conta conta2 = new Conta("Adriano", 2);
		Conta conta3 = new Conta("Bruno", 7);
		Conta conta4 = new Conta("Fernando", 4);

		List<Conta> lista = Arrays.asList(conta, conta2, conta3, conta4);

		System.out.println("Lista não ordenada:");
		lista.forEach(c -> System.out.println(conta));
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Lista ordenada por ordem alfabética:");
		imprimeLista(lista);
		System.out.println("--------------------------------------------------------------------------");
        imprimeTitularConta(lista);
	}

	private static void imprimeTitularConta(List<Conta> lista) {
		System.out.println("Imprime o titular da conta ordenada em ordem alfabética:");
		
		//Ordena a lista com uma lambda expression
		//lista.sort((c1, c2) -> c1.getTitular().compareTo(c2.getTitular()));
		
		//ordena a lista com metod reference
		lista.sort(Comparator.comparing(Conta::getTitular));
		
		lista.forEach(c -> System.out.println(c.getTitular()));
	}

	private static  void imprimeLista(List<Conta> lista) {
		// lambda que ordena a lista por ordem alfabética(imprime a lista, pois
		// a classe conta sobscreveu toString())
		lista.sort((c1, c2) -> c1.getTitular().compareTo(c2.getTitular()));

		System.out.println("Imprime lista com lambda:");
		lista.forEach(conta -> System.out.println(conta));
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Imprime lista com method reference, deixando ainda mais simples:");
		lista.forEach(System.out::println);
	}

}
