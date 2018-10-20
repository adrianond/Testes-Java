package br.com.teste;

import java.util.Arrays;

public class RetirarRepetidos {

	public static void main(String[] args) {

		String[] repetidos = { "adriano", "adriano","adriano", "paulo", "cesar", "cesar"};
/*
		String[] correto = semRepetidos(repetidos);
        Arrays.sort(correto);
		for (String teste : correto) {
			System.out.println(teste);
		}*/
		
		//Só os dados repetidos
		String[] repetido = repetidos(repetidos);
		for (String teste : repetido) {
			System.out.println(teste);
		}
	}
	
	private static String[] repetidos(String[] repetidos) {
		int size = repetidos.length;

		for (int i = 0; i < size; i++) {
			int valuesRepetidos = 0;
			for (int j = i + 1; j < size; j++) {
				if (repetidos[j].equals(repetidos[i])) {
					valuesRepetidos++;
				}
			}
		}
	}

	private static String[] semRepetidos(String[] repetidos) {
		int size = repetidos.length;

		String novo[] = Arrays.copyOf(repetidos, size);

		for (int i = 0; i < size; i++) {
			int posicao = i;
			//posição(indice) que o novo array vai guardar os dados
			int k = i + 1;
			int removidos = 0;
			for (int j = i + 1; j < size; j++) {
				int posicaoJ = j;
				String stringNovoJ = novo[j];
				String stringNovoI = novo[i];
				if (novo[j].equals(novo[i])) {
					removidos++;
				} else {
					novo[k] = novo[j];
				}
			}
			size = size - removidos;
		}
		novo = Arrays.copyOf(novo, size);
		return novo;
	}
}