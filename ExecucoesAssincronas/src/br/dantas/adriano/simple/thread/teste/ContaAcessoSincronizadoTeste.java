package br.dantas.adriano.simple.thread.teste;

import java.util.List;

import br.com.dantas.adriano.simple.thread.service.ContaServiceImpl;
import br.dantas.adriano.simple.thread.Conta;

public class ContaAcessoSincronizadoTeste implements Runnable{
	
	private ContaServiceImpl contaImpl  = null;
	Conta conta = null;
	List<String> investimentos = null;
	
	public static void main(String[] args) {
		ContaAcessoSincronizadoTeste teste = new ContaAcessoSincronizadoTeste();
		Thread adriano = new Thread(teste, "Adriano");
		Thread milena = new Thread(teste, "Milena");
		
		//inicia/start a thread e chama o m�todo run, n�o � poss�vel determinar a ordem da thread que ser� chamada
		adriano.start();
		milena.start();
		//teste.consultar();
	}
	
	/**
	 * M�todo � synchronized para que apenas uma thread por vez tenha acesso ao mesmo, implementando assim uma chamada sincrona,
	 *  mas n�o � garantido qual thread executar� o m�todo, mas � certo que ser� uma por vez
	 *  S� � poss�vel syncronizar m�todos ou o bloco c�digo que deseja, n�o � poss�vel synchronizar classes ou variaveis
	 *  
	 * @param valor
	 */
	private synchronized void saque(Conta conta, int valor) {
		 contaImpl  = new ContaServiceImpl();
		 
		/**
		 * aqui estou sincronizando o bloco de c�digo ao inv�s do m�todo, ou seja 
		 * a assinatuta do m�todo pode ser sem synchronized
		 * Mas quando sincronizar um bloco, um objeto neste caso objeto conta, � importante que n�o seja
		 * poss�vel criar um outro objeto para essa mesma variavel de referencia (conta), logo utilize o modificador final : private final Conta conta  = new Conta();
		 */
		/*synchronized (conta) {
			if (conta.getSaldo() >= valor) {
				System.out.println(Thread.currentThread().getName() + " est� indo sacar");
				conta.saque(valor);
				System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
			} else {
				System.out.println("Sem dinheiro para: " + Thread.currentThread().getName()
						+ " efetuar o saque, saldo: " + conta.getSaldo());
			}
		}*/

		if (conta.getSaldo() >= valor) {
			System.out.println(Thread.currentThread().getName() + " est� indo sacar");
			try {
				// n�o importa se parei a thread, outra n�o executar� esse
				// m�todo at� a thread atual terminar a execu��o
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contaImpl.saque(conta, valor);
			System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
		} else {
			System.out.println("Sem dinheiro para: " + Thread.currentThread().getName() + " efetuar o saque, saldo: "
					+ conta.getSaldo());
		}

	}
	
	/**
	 * Tamb�m � poss�vel sincronizar m�todos estaticos, pois pertecem a classe e somente existe uma c�pia desses m�todos
	 */
	public static synchronized void imprimir() {

		System.out.println("O Thread " + Thread.currentThread().getName() + " est� imprimindo");

		/**
		 * a mesma coisa que acima sincronizo o bloco e n�o o m�todo, pode tirar o synchronized do m�todo
		 */
		/*synchronized (ContaTeste.class) {
			System.out.println("Imprime");
		}
*/
	}

	/**
	 * Implementou Runnable, � necess�rio implementar o m�todo run()
	 */
	@Override
	public void run() {
		 conta = new Conta(50, investimentos);
		imprimir();

		for (int i = 0; i < 5; i++) {
			saque(conta, 10);
			if (conta.getSaldo() < 0) {
				System.out.println("Oh meu Deus!");
			}
		}
	}
	
	/**
	 * 
	 */
	public void consultar() {
		System.out.println("M�todo de consulta");
	}

}
