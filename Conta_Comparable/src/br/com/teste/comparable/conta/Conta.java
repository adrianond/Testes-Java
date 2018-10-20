package br.com.teste.comparable.conta;

/**
 * Classe que implementa Comparable para comparar por ordem numérica
 * @author 660454
 *
 */
public class Conta implements Comparable<Conta> {

	private int numero;
	private String titular;
	
	public Conta(){
		
	}
	
	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	
	public int compareTo(Conta conta) {

		if (this.numero < conta.numero) {
			return -1;
		}
		if (this.numero > conta.numero) {
			return 1;
		}
		return 0;
	}
	
	 @Override
	    public String toString() {
	        return "Conta{numero='" + numero + ", titular='" + titular + "}";
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
