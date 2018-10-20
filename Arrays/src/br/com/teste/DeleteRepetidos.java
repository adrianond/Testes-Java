package br.com.teste;

import java.util.ArrayList;
import java.util.List;

public class DeleteRepetidos {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano", "paulo", "adriano", "adriano"};

		List<String> lista = getRepetidos(repetidos);
		exibirRepetidos(lista);

		System.out.println("--------------------------------------------------------------------------------");
		
		List<String> list = retirarRepetidos(repetidos);
		exibirNaoRepetidos(list);
	}

	private static void exibirNaoRepetidos(List<String> list) {
		String[] apenasRepetidos = new String[list.size()];
		apenasRepetidos = list.toArray(apenasRepetidos);
		for (String r : apenasRepetidos) {
			System.out.println("Array sem repetidos: " + r);
		}
	}

	private static List<String> retirarRepetidos(String[] repetidos) {
		List<String> lista = new ArrayList<String>();
		int size = repetidos.length;

		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (!repetidos[j].equals(repetidos[i])) {
					if (!lista.contains(repetidos[j])) {
						lista.add(repetidos[j]);
					}
				}
			}
		}
		return lista;
	}

	

	private static void exibirRepetidos(List<String> lista) {
		String[] apenasRepetidos = new String[lista.size()];
		apenasRepetidos = lista.toArray(apenasRepetidos);

		for (String r : apenasRepetidos) {
			System.out.println("valores repetidos: " + r);
		}
	}

	private static List<String> getRepetidos(String[] repetidos) {
		List<String> lista = new ArrayList<String>();
		int size = repetidos.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (repetidos[j].equals(repetidos[i])) {
					if (!lista.contains(repetidos[i])) {
					    lista.add(repetidos[i]);
					}
				}
			}
		}
		return lista;
	}
}
