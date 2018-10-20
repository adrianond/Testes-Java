package br.com.teste.interna.collections;

import java.util.Comparator;

public class Conta implements Comparator<Conta> {

	private int numero;
	private String titular;

	public Conta() {

	}

	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	@Override
	public int compare(Conta conta, Conta outraConta) {
		return conta.getTitular().compareTo(outraConta.getTitular());
	}
	
	 @Override
	    public String toString() {
	        return "Conta{titular:"+titular+", numero:"+numero+"}";
	    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
