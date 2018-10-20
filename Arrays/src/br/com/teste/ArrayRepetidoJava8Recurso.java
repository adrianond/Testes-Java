package br.com.teste;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayRepetidoJava8Recurso {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano", "paulo", "cesar", "cesar" };

		String[] correto = tirarRepetidos(repetidos);

		for (String s : correto) { 
			System.out.println(s); }
	}

	private static String[] tirarRepetidos(String[] repetidos) {
		Stream<String> stream1 = Arrays.stream(repetidos).distinct();
		String[] teste = stream1.toArray(String[]::new);
		return  teste;
	}

}
