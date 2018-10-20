package com.teste.treeSet;

import java.util.Comparator;

import teste.com.pessoa.Pessoa2;

public class Pessoa2Comparator implements Comparator<Pessoa2> {

	@Override
	public int compare(Pessoa2 o1, Pessoa2 o2) {
		//ordem alfabética
		//return o1.getNome().compareTo(o2.getNome());
		return Integer.compare(o1.getNome().length(), (o2.getNome().length()));
	}
}
