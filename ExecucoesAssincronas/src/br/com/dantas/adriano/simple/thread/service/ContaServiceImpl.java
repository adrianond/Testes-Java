package br.com.dantas.adriano.simple.thread.service;

import java.util.Arrays;
import java.util.List;

import br.dantas.adriano.simple.thread.Conta;

public class ContaServiceImpl implements ContaService {

	public void saque(Conta conta, int valor) {
		conta.setSaldo(conta.getSaldo() - valor);

	}

	public Conta consultarSaldo(Conta conta) {
		List<String> investimentos = Arrays.asList("CDB", "Previdência", "Tesouro Direto", "Capitalização");
		conta = new Conta(50, investimentos);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		return conta;
	}

	/**
	 * Crio uma Thread para executar esse método em paralelo
	 */

	public void consultarInvestimentosConta() {
		new Thread() {
			public void run() {
				Conta conta = new Conta();
				List<String> investimentos = retornarListaInvestimentos();
				conta.setInvestimentos(investimentos);
				for (int i = 1; i < 21; i++) {
					System.out.println("Investimento " + i + ":" + conta.getInvestimentos());
				}
			}

		}.start();
	}
	 
    /**
     * Foi criada uma Thread para executar esse processo em paralelo
     */
	public void consultarInvestimentosConta(Conta conta) {
		List<String> investimentos = retornarListaInvestimentos();
		conta.setInvestimentos(investimentos);
		for (int i = 1; i < 21; i++) {
			System.out.println("Investimento " + i + ":" + conta.getInvestimentos());
		}
	}

	private static List<String> retornarListaInvestimentos() {
		List<String> investimentos = Arrays.asList("CDB", "Previdência", "Tesouro Direto", "Capitalização");
		return investimentos;
	}
}
