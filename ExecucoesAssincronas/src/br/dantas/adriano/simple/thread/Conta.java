package br.dantas.adriano.simple.thread;

import java.util.List;

public class Conta {

	private int saldo;
	private List<String> investimentos;

	public Conta() {

	}

	/**
	 * 
	 * @param saldo
	 */
	public Conta(int saldo, List<String> investimentos) {
		this.saldo = saldo;
		this.investimentos = investimentos;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the investimentos
	 */
	public List<String> getInvestimentos() {
		return investimentos;
	}

	/**
	 * @param investimentos
	 *            the investimentos to set
	 */
	public void setInvestimentos(List<String> investimentos) {
		this.investimentos = investimentos;
	}
}
