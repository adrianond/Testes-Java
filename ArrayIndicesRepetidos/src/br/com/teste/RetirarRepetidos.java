package br.com.teste;

import java.util.Arrays;

public class RetirarRepetidos {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano", "paulo", "cesar" };

		String[] correto = semRepetidos(repetidos);

		for (String teste : correto) {
			System.out.println(teste);
		}

	}

	private static String[] semRepetidos(String[] repetidos) {
		int size = repetidos.length;

		String novo[] = Arrays.copyOf(repetidos, size);

		for (int i = 0; i < size; i++) {
			int k = i + 1;
			int removidos = 0;
			for (int j = i + 1; j < size; j++) {
				if (novo[j].equals(novo[i])) {
					removidos++;
				} else {
					novo[k++] = novo[j];
				}
			}
			size = size - removidos;
		}
		novo = Arrays.copyOf(novo, size);
		return novo;
	}
}