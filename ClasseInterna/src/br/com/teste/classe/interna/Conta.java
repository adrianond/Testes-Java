package br.com.teste.classe.interna;

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
		//compara a lista pela ordem alfabetica da string
		//return conta.getTitular().compareTo(outraConta.getTitular());
		
		//compara lista pelo tamanho da string
		//return Integer.compare(conta.getTitular().length(), outraConta.getTitular().length());
		
		//compara a lista pela ordem numerica descrecente do n�mero da conta
		if (outraConta.getNumero() < conta.getNumero()) {
			return -1;
		}
		if (outraConta.getNumero() > conta.getNumero()) {
			return 1;
		}
		return 0;
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
