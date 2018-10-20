package br.com.teste.classe.itnterna.anonima;

import java.util.Collections;
import java.util.List;

import br.com.teste.classe.itnterna.anonima.conta.Conta;
import br.com.teste.classe.itnterna.anonima.interface_.Texto;

/**
 * Classe anonima: 
 * 1. Classe que tem seu comportamento alterado quando a mesma é instanciada
 * 2. Podem implementar interface
 * 3.Muito utilizada com Collections
 * 
 * @author 660454
 *
 */
public class ClasseAnonima {

	public void imprimir() {
		System.out.println("Imprime texto");
	}

	public List<Conta> retornaLista() {
		return null;
	}

	public static void main(String[] args) {
		UsarMetodoClasseAnonima usarMetodoClasseAnonima = new UsarMetodoClasseAnonima();

		ClasseAnonima anonima = new ClasseAnonima();
		anonima.imprimir();
		System.out.println("------------------------------------------------------------------");

		// altero comportamento da classe ao instancia - la
		ClasseAnonima anonima2 = new ClasseAnonima() {
			public void imprimir() {
				System.out.println("Imprime texto sobrescrito");
				System.out.println("------------------------------------------------------------------");
			}

		};
		anonima2.imprimir();

		// classe anonima que implementa uma interface
		Texto texto = new Texto() {
			@Override
			public void imprirTexto() {
				System.out.println("Imprime texto da interface");
				System.out.println("------------------------------------------------------------------");
			}

		};
		texto.imprirTexto();

		// classe anonima usando Collections para ordenar a lista
		ClasseAnonima anonima3 = new ClasseAnonima() {

			public List<Conta> retornaLista() {
				Conta conta = new Conta("Elizangela", 1014);
				Conta conta2 = new Conta("Adriano", 1212);
				Conta conta3 = new Conta("Sebastiao", 8976);
				Conta conta4 = new Conta("Gabriela", 1089);

				List<Conta> listaConta = new java.util.ArrayList<Conta>();
				listaConta.add(conta);
				listaConta.add(conta2);
				listaConta.add(conta3);
				listaConta.add(conta4);
				
				System.out.println("Lista sem ordenar");
				System.out.println("------------------------------------------------------------------");
				System.out.println(listaConta);
				System.out.println("------------------------------------------------------------------");
				
				Collections.sort(listaConta, new Conta());
				
				System.out.println("Lista  ordenada");
				System.out.println("------------------------------------------------------------------");
				System.out.println(listaConta);
				System.out.println("------------------------------------------------------------------");
				
				return listaConta;
			}
		};
		List<Conta> lista = anonima3.retornaLista();
		
		for(Conta conta : lista){
			Conta object = new Conta();
			object.setNumero(conta.getNumero());
			object.setTitular(conta.getTitular());
			System.out.println("Titular: " + object.getTitular() + " Numero: " + object.getNumero());
		}
		usarMetodoClasseAnonima.listaConta(anonima3.retornaLista());
	}
}
