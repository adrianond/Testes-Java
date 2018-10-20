package com.teste.treeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import teste.com.pessoa.Pessoa;

public class TreeSetPessoas {

	public static void main(String[] args) {

		simpleTreeSet();
		treeSetListObject();
		treeSetObject();
	}		

	private static void treeSetObject() {
		TreeSet<Pessoa> set = new TreeSet<Pessoa>();
		set.add(new Pessoa("Joao", "Silva", 9));
		set.add(new Pessoa("Adriano", "Dantas", 1));
		set.add(new Pessoa("Felipe", "Coelho", 2));
		set.add(new Pessoa("Adriano", "Dantas", 1));
		
		System.out.println("Imprime o Objeto Pessoa");
		set.forEach((Pessoa p) -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(p.getNome());
			pessoa.setSobrenome(p.getSobrenome());
			pessoa.setIdade(p.getIdade());
			System.out.println(pessoa.getIdade() + " " + pessoa.getNome().concat(" ").concat(pessoa.getSobrenome()));
		});
	}

	private static void treeSetListObject() {
		List<Pessoa> listPessoa = Arrays.asList(new Pessoa("Adriano", "Dantas", 1), new Pessoa("Adriano", "Dantas", 1),new Pessoa("Felipe", "Coelho", 2), new Pessoa("Joao", "Silva", 9), new Pessoa("Cesar", "Castilho", 8));
		List<Pessoa> listPessoa2 = Arrays.asList(new Pessoa("Arlanio", "Dantas", 1), new Pessoa("Arlanio", "Dantas", 1),new Pessoa("Carlos", "Coelho", 2), new Pessoa("Jose", "Silva", 9), new Pessoa("Cesar", "Castilho", 8));
		
		TreeSet<Pessoa> t = retornarPessoas(listPessoa, listPessoa2);
		System.out.println("Imprime o TreeSet<Pessoa>");
		System.out.println("Imprime não adiciona dados repetidos");
		System.out.println("Imprime o ordena em ordem crescente");
		t.forEach((Pessoa p) -> {
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(p.getNome());
				pessoa.setSobrenome(p.getSobrenome());
				pessoa.setIdade(p.getIdade());
				System.out.println(pessoa.getIdade() + " " + pessoa.getNome().concat(" ").concat(pessoa.getSobrenome()));
			});
		System.out.println("-------------------------------------------------------------------------------");
	}

	private static TreeSet<Pessoa> retornarPessoas(List<Pessoa> listPessoa, List<Pessoa> listPessoa2) {
		TreeSet<Pessoa> t = new TreeSet<Pessoa>();
		System.out.println("Percorre a lista de Pessoa e add em um Set do tipo Pessoa");
		listPessoa.forEach((Pessoa p) -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(p.getNome());
			pessoa.setSobrenome(p.getSobrenome());
			pessoa.setIdade(p.getIdade());
			t.add(pessoa);
		});
		listPessoa2.forEach((Pessoa p2) -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(p2.getNome());
			pessoa.setSobrenome(p2.getSobrenome());
			pessoa.setIdade(p2.getIdade());
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
