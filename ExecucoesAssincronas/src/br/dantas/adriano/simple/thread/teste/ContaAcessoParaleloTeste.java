package br.dantas.adriano.simple.thread.teste;

import br.com.dantas.adriano.simple.thread.service.ContaServiceImpl;
import br.dantas.adriano.simple.thread.Conta;

public class ContaAcessoParaleloTeste implements Runnable {
	
	static ContaServiceImpl contaImpl = new ContaServiceImpl();
	static Conta conta = new Conta();
	
	public static void main(String[] args) {
		
		ContaAcessoParaleloTeste teste = new ContaAcessoParaleloTeste();
		Thread t = new Thread(teste);
		t.start();
		//chamando desta maneira não preciso implementar a interface Runnable, verifique na classe ContaServiceImpl
		contaImpl.consultarInvestimentosConta();
		contaImpl.consultarSaldo(conta);
				
	}

	@Override
	public void run() {
		contaImpl.consultarInvestimentosConta(conta);
	}
	
	

}
