package ordenar.colecao.sem.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.teste.conta.Conta;

public class OrdenarLista {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Pedro", 9);
		Conta conta2 = new Conta("Paulo", 8);
		Conta conta3 = new Conta("Adriano", 1);
		Conta conta4 = new Conta("Ricardo", 2);

		List<Conta> list = Arrays.asList(conta1, conta2, conta3, conta4);
		List<String> palavras = Arrays.asList("Rodrigo", "Paulo", "Caelum", "Rodrigo");

		System.out.println("Lista sem ordenar");
		System.out.println("------------------------------------------------------------------");
		System.out.println(palavras);

		List<String> lista = listaOrdenada(palavras);
		System.out.println("Lista ordenada");
		System.out.println("------------------------------------------------------------------");
		System.out.println(lista);

		System.out.println("------------------------------------------------------------------");
		listaOrdenadaConta(list);

	}

	private static List<String> listaOrdenada(List<String> palavras) {

		// Classe anonima local
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		// Collections.sort(palavras, comparator);

		// metodo novo em java.uitil.List
		palavras.sort(comparator);
		return palavras;
	}

	private static void listaOrdenadaConta(List<Conta> list) {
		System.out.println("Lista ordenada Conta");
		// Classe anonima local
		Comparator<Conta> comparator = new Comparator<Conta>() {
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getTitular().length(), c2.getTitular().length());
			}
		};
		// Collections.sort(list, comparator);

		// metodo novo em java.uitil.List
		list.sort(comparator);

		for (Conta conta : list) {
			Conta objeto = new Conta();
			objeto.setNumero(conta.getNumero());
			objeto.setTitular(conta.getTitular());
			System.out.println(objeto.getNumero());
			System.out.println(objeto.getTitular());
		}
	}
}
