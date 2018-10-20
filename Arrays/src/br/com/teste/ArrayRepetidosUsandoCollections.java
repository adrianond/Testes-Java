package br.com.teste;

import java.util.HashSet;
import java.util.Set;

public class ArrayRepetidosUsandoCollections {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano", "paulo", "cesar", "cesar" };

		Set<String> resultado = arrayCorreto(repetidos);
	
		String[] arr = resultado.toArray(new String[resultado.size()]);
		for (String r : arr) {
			System.out.println(r);
		}

	}

	private static Set<String> arrayCorreto(String[] repetidos) {
		Set<String> set = new HashSet<String>();
		for (String s : repetidos) {
			set.add(s);
		}
		return set;
	}
}
