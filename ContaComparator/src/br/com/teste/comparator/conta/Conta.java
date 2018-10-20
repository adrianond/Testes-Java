package br.com.teste.comparator.conta;

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
		//ordem alfabética
		//return conta.getTitular().compareTo(outraConta.getTitular());
		//tamanho da String
		return Integer.compare(conta.getTitular().length(), outraConta.getTitular().length());
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
