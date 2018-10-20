package br.com.teste.comparator.conta;

import java.util.Collections;
import java.util.List;

public class ContaTeste {

	public static void main(String[] args) {

		Conta conta = new Conta("Carlos Alberto", 1014);
		Conta conta2 = new Conta("Paulo Roberto", 1212);
		Conta conta3 = new Conta("Bruno Henrique", 8976);
		Conta conta4 = new Conta("Elisio Santos", 1089);

		List<Conta> listaConta = new java.util.ArrayList<Conta>();
		listaConta.add(conta);
		listaConta.add(conta2);
		listaConta.add(conta3);
		listaConta.add(conta4);

		System.out.println("Lista não ordenada:");
		System.out.println(listaConta);

		Collections.sort(listaConta, new Conta());
		System.out.println("Lista ordenada:");
		System.out.println(listaConta);

	}

}
