package com.teste.treeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import teste.com.pessoa.Pessoa2;

public class TreeSetPessoas2 {

	public static void main(String[] args) {

		simpleTreeSet();
		treeSetListObject();
		treeSetObject();
	}		

	private static void treeSetObject() {
		TreeSet<Pessoa2>  set = new TreeSet<Pessoa2>(new Pessoa2Comparator());
		set.add(new Pessoa2("Joao", "Silva"));
		set.add(new Pessoa2("Adriano", "Dantas"));
		set.add(new Pessoa2("Felipe", "Coelho"));
		set.add(new Pessoa2("Adriano", "Dantas"));
		
		System.out.println("Imprime o TreeSet<Pessoa>, como se trata de um objeto customizado 'Pessoa', "
				+ "deve ser implementado o sort do objeto - neste caso por ordem alfabética ou tamanho da String");
		set.forEach((Pessoa2 p) -> {
			Pessoa2 pessoa = new Pessoa2();
			pessoa.setNome(p.getNome());
			pessoa.setSobrenome(p.getSobrenome());
			System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome());
		});
	}

	private static void treeSetListObject() {
		List<Pessoa2> listPessoa = Arrays.asList(new Pessoa2("Adriano", "Dantas"), new Pessoa2("Adriano", "Dantas"),new Pessoa2("Felipe", "Coelho"), new Pessoa2("Joao", "Silva"), new Pessoa2("Cesar", "Castilho"));
		List<Pessoa2> listPessoa2 = Arrays.asList(new Pessoa2("Arlanio", "Dantas"), new Pessoa2("Arlanio", "Dantas"),new Pessoa2("Carlos", "Coelho"), new Pessoa2("Jose", "Silva"), new Pessoa2("Cesar", "Castilho"));
		
		TreeSet<Pessoa2> t = retornarPessoas(listPessoa, listPessoa2);
		System.out.println("Imprime o TreeSet<Pessoa>");
		System.out.println("Imprime não adiciona dados repetidos");
		System.out.println("Imprime o ordena em ordem crescente, pois foi implementado o comparator para o obejto Pessoa");
		t.forEach((Pessoa2 p) -> {
				Pessoa2 pessoa = new Pessoa2();
				pessoa.setNome(p.getNome());
				pessoa.setSobrenome(p.getSobrenome());
				System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome());
			});
		System.out.println("-------------------------------------------------------------------------------");
	}

	private static TreeSet<Pessoa2> retornarPessoas(List<Pessoa2> listPessoa, List<Pessoa2> listPessoa2) {
		TreeSet<Pessoa2> t = new TreeSet<Pessoa2>(new Pessoa2Comparator());
				
		System.out.println("Percorre a lista de Pessoa e add em um Set do tipo Pessoa");
		listPessoa.forEach((Pessoa2 p) -> {
			Pessoa2 pessoa = new Pessoa2();
			pessoa.setNome(p.getNome());
			pessoa.setSobrenome(p.getSobrenome());
			t.add(pessoa);
		});
		listPessoa2.forEach((Pessoa2 p2) -> {
			Pessoa2 pessoa = new Pessoa2();
			pessoa.setNome(p2.getNome());
			pessoa.setSobrenome(p2.getSobrenome());
			t.add(pessoa);
		});
		return t;
	}

	private static void simpleTreeSet() {
		TreeSet<String> ts1 = new TreeSet<String>();
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts1.add("C");
		ts1.add("B");
		ts1.add("A");
		ts1.add("A");
		
		ts2.add(9);
		ts2.add(8);
		ts2.add(7);
		ts2.add(7);

		System.out.println("TreeSet não aceita dados repetidos e ordena por ordem crescente");
		System.out.println(ts1); // [A,B,C]
		System.out.println(ts2); 
		System.out.println("--------------------------------------------------------------------------");
	}

}
