package odenar.colecao.com.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UseLambda {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Rodrigo", "Paulo", "Caelum");
		
		
		

		System.out.println("Lista sem ordenar");
		System.out.println(palavras);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Lista ordenada pelo tamanho da String");
		List<String> lista = listaOrdenada(palavras);
		System.out.println(lista);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Há apenas uma instrução dentro da lambda? Então pode excluir as chaves e o return");
		List<String> lista2 = listaOrdenadaMenosCodigo(palavras);
		System.out.println(lista2);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Reduza mais seu codigo lambda");
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Comparator tem um metodo comparing que recebe uma lambda para ordenar a lista
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//posso usar metod reference
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
	}

	/**
	 * 
	 * @param palavras
	 * @return
	 */
	private static List<String> listaOrdenadaMenosCodigo(List<String> palavras) {

		Comparator<String> comparator = (s1, s2) -> 
			 Integer.compare(s1.length(), s2.length());
		
		palavras.sort(comparator);
		return palavras;
	}

	/**
	 * 
	 * @param palavras
	 * @return
	 */
	private static List<String> listaOrdenada(List<String> palavras) {

		Comparator<String> comparator = (s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		};
		palavras.sort(comparator);
		return palavras;
	}

}
