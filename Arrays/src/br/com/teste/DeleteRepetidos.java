package br.com.teste;

import java.util.ArrayList;
import java.util.List;

public class DeleteRepetidos {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano", "paulo", "paulo", "ricardo",  "adriano", "adriano"};

		removerRepetidos(repetidos);
		imprimirRepetidos(repetidos);
	}

	private static void imprimirRepetidos(String[] repetidos) {
		List<String> lista = new ArrayList<String>();
		int size = repetidos.length;

		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (repetidos[i].equals(repetidos[j])) {
					if (!lista.contains(repetidos[j])) {
						lista.add(repetidos[j]);
					}
				}
			}
		}
		String[] apenasRepetidos = new String[lista.size()];
		apenasRepetidos = lista.toArray(apenasRepetidos);
		for (String r : apenasRepetidos) {
			System.out.println("Array repetidos: " + r);
		}
	}

	private static void removerRepetidos(String[] repetidos) {

		List<String> lista = new ArrayList<String>();
		int size = repetidos.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (!repetidos[i].equals(repetidos[j])) {
					if (!lista.contains(repetidos[j])) {
						lista.add(repetidos[j]);
					}
				}
			}
		}
		String[] apenasRepetidos = new String[lista.size()];
		apenasRepetidos = lista.toArray(apenasRepetidos);
		for (String r : apenasRepetidos) {
			System.out.println("Array sem repetidos: " + r);
		}
		System.out.println("--------------------------------------------------------------------------------");
	}
}
