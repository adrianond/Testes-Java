package br.com.teste.classe.interna;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClasseInternaRetornaListaOrdenada {
	
	public class RetornaListaOrdenada {

		public List<Conta> listaOrdenada(List<Conta> list) {
			Collections.sort(list, new Conta());
			return list;
		}
	}
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("Elizangela", 3);
		Conta conta2 = new Conta("Adriano", 1);
		Conta conta3 = new Conta("Sebastiao", 8);
		Conta conta4 = new Conta("Gabriela", 2);
		
		List<Conta> lista = Arrays.asList(conta, conta2, conta3, conta4);
		
		ClasseInternaRetornaListaOrdenada externa  = new ClasseInternaRetornaListaOrdenada();
		RetornaListaOrdenada interna = externa.new RetornaListaOrdenada();
		List<Conta> list = interna.listaOrdenada(lista);
		System.out.println(list);
		
	}

}
