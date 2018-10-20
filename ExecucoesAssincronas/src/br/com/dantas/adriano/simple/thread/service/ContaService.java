package br.com.dantas.adriano.simple.thread.service;

import br.dantas.adriano.simple.thread.Conta;

public interface ContaService {

	public void saque(Conta conta, int valor);
	
	public Conta consultarSaldo(Conta conta);
	
	public void consultarInvestimentosConta();
	
	public void consultarInvestimentosConta(Conta conta);

}
