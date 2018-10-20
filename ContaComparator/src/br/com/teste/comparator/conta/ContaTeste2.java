package br.com.teste.comparator.conta;

import java.util.Collections;
import java.util.List;

public class ContaTeste2 {

	public static void main(String[] args) {

		Conta2 conta = new Conta2("Carlos Alberto", 9);
		Conta2 conta2 = new Conta2("Paulo Roberto", 1);
		Conta2 conta3 = new Conta2("Bruno Henrique", 8);
		Conta2 conta4 = new Conta2("Elisio Santos", 0);

		List<Conta2> listaConta = new java.util.ArrayList<Conta2>();
		listaConta.add(conta);
		listaConta.add(conta2);
		listaConta.add(conta3);
		listaConta.add(conta4);

		System.out.println("Lista não ordenada:");
		System.out.println(listaConta);

		Collections.sort(listaConta, new Conta2());
		System.out.println("Lista ordenada por ordem numérica:");
		System.out.println(listaConta);

	}

}
