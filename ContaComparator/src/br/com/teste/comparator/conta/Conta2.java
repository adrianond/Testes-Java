package br.com.teste.comparator.conta;

import java.util.Comparator;

public class Conta2 implements Comparator<Conta2> {

	private int numero;
	private String titular;

	public Conta2() {

	}

	public Conta2(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	@Override
	public int compare(Conta2 conta, Conta2 outraConta) {
		return Integer.compare(conta.getNumero(), outraConta.getNumero());
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
