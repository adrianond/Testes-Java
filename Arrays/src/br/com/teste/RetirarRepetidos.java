package br.com.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetirarRepetidos {

	public static void main(String[] args) {

		String[] nomes = { "adriano", "adriano", "adriano", "paulo", "cesar", "cesar" };

		arraySemElementosRepetidos(nomes);
		  
		 

		  //Só os dados repetidos 
		  String[] repetidos = repetidos2(nomes); 
		  for (String teste : repetidos) { 
			  System.out.println("Array de repetidos: " + teste); 
		  }
	}

	private static String[] repetidos(String[] nomes) {
		int size = nomes.length;
		String[] repetidos = new String[5];
		int valuesRepetidos = 0;
		List<Aluno> lista = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nomes[j].equals(nomes[i])) {
					valuesRepetidos++;
					RetirarRepetidos rep = new RetirarRepetidos();
					Aluno aluno = rep.new Aluno(nomes[j]);
					lista.add(aluno);
					repetidos[i] = nomes[j];
				}
			}
		}
		lista.forEach((s) -> {
			System.out.println(s.getNome());
		});

		System.out.println("Total de repetidos: " + valuesRepetidos);
		return repetidos;
	}

	private static String[] repetidos2(String[] repetidos) {
		int size = repetidos.length;

		String novo[] = Arrays.copyOf(repetidos, size);

		for (int i = 0; i < repetidos.length; i++) {
			int posicao = i;
			// posição(indice) que o novo array vai guardar os dados
			int k = i + 1;
			int nao_repetidos = 0;
			for (int j = i + 1; j < size; j++) {
				int posicaoJ = j;
				String stringNovoJ = novo[j];
				String stringNovoI = novo[i];
				if (novo[j].equals(novo[i])) {
					novo[k] = novo[j];
				} else {
					nao_repetidos++;
				}
			}
			size = size - nao_repetidos;
		}
		novo = Arrays.copyOf(novo, size);
		return novo;
	}
	
	private static void arraySemElementosRepetidos(String[] repetidos) {
		int size = repetidos.length;

		String novo[] = Arrays.copyOf(repetidos, size);

		for (int i = 0; i < repetidos.length; i++) {
			int posicao = i;
			// posição(indice) que o novo array vai guardar os dados
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
		
		for (String teste : novo) { 
			  System.out.println(teste); 
		  }
	}

	public class Aluno {

		private String nome;

		public Aluno() {

		}

		public Aluno(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}
}