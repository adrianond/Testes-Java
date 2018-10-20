package br.com.teste.interna.collections;

import java.util.Collections;
import java.util.List;

public class Externa {

	public class Interna {

		public List<Conta> retornaLista() {
			Conta conta = new Conta("Carlos Alberto", 1014);
			Conta conta2 = new Conta("Paulo Roberto", 1212);
			Conta conta3 = new Conta("Bruno Henrique", 8976);
			Conta conta4 = new Conta("Elisio Santos", 1089);

			List<Conta> listaConta = new java.util.ArrayList<Conta>();
			listaConta.add(conta);
			listaConta.add(conta2);
			listaConta.add(conta3);
			listaConta.add(conta4);

			Collections.sort(listaConta, new Conta());

			return listaConta;
		}
	}

}
