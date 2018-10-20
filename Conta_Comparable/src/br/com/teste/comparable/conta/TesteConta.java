package br.com.teste.comparable.conta;

import java.util.Collections;
import java.util.List;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("Carlos Alberto" , 9);
		Conta conta2 = new Conta("Paulo Roberto" , 2);
		Conta conta3 = new Conta("Bruno Henrique" , 4);
		Conta conta4 = new Conta("Elisio Santos" , 1);
		
		List<Conta> listaConta = new java.util.ArrayList<Conta>();
		listaConta.add(conta);
		listaConta.add(conta2);
		listaConta.add(conta3);
		listaConta.add(conta4);
		
		System.out.println("Lista não ordenada:");
		System.out.println(listaConta);
		System.out.println("--------------------------------------------------------------------");
		listaNaoOrdenadaToObject(listaConta);
		System.out.println("--------------------------------------------------------------------");
		
		Collections.sort(listaConta);
		System.out.println("Lista ordenada:");
		System.out.println(listaConta);
		System.out.println("--------------------------------------------------------------------");
		listaOrdenadaToObject(listaConta);
	}

	private static void listaOrdenadaToObject(List<Conta> listaConta) {
		for (Conta conta : listaConta) {
			Conta contaObject = new Conta();
			contaObject.setNumero(conta.getNumero());
			contaObject.setTitular(conta.getTitular());
			System.out.println("Objeto conta ordenado numero da conta: " + contaObject.getNumero());
			System.out.println("Objeto conta ordenado titular: " + contaObject.getTitular());
		}
		
	}

	private static void listaNaoOrdenadaToObject(List<Conta> listaConta) {
		for (Conta conta : listaConta) {
			Conta contaObject = new Conta();
			contaObject.setNumero(conta.getNumero());
			contaObject.setTitular(conta.getTitular());
			System.out.println("Objeto conta não ordenado numero da conta: " + contaObject.getNumero());
			System.out.println("Objeto conta não ordenado titular: " + contaObject.getTitular());
		}
		
	}

}
