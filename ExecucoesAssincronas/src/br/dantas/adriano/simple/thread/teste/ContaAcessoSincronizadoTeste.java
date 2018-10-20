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
		
		//inicia/start a thread e chama o método run, não é possível determinar a ordem da thread que será chamada
		adriano.start();
		milena.start();
		//teste.consultar();
	}
	
	/**
	 * Método é synchronized para que apenas uma thread por vez tenha acesso ao mesmo, implementando assim uma chamada sincrona,
	 *  mas não é garantido qual thread executará o método, mas é certo que será uma por vez
	 *  Só é possível syncronizar métodos ou o bloco código que deseja, não é possível synchronizar classes ou variaveis
	 *  
	 * @param valor
	 */
	private synchronized void saque(Conta conta, int valor) {
		 contaImpl  = new ContaServiceImpl();
		 
		/**
		 * aqui estou sincronizando o bloco de código ao invés do método, ou seja 
		 * a assinatuta do método pode ser sem synchronized
		 * Mas quando sincronizar um bloco, um objeto neste caso objeto conta, é importante que não seja
		 * possível criar um outro objeto para essa mesma variavel de referencia (conta), logo utilize o modificador final : private final Conta conta  = new Conta();
		 */
		/*synchronized (conta) {
			if (conta.getSaldo() >= valor) {
				System.out.println(Thread.currentThread().getName() + " está indo sacar");
				conta.saque(valor);
				System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
			} else {
				System.out.println("Sem dinheiro para: " + Thread.currentThread().getName()
						+ " efetuar o saque, saldo: " + conta.getSaldo());
			}
		}*/

		if (conta.getSaldo() >= valor) {
			System.out.println(Thread.currentThread().getName() + " está indo sacar");
			try {
				// não importa se parei a thread, outra não executará esse
				// método até a thread atual terminar a execução
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
	 * Também é possível sincronizar métodos estaticos, pois pertecem a classe e somente existe uma cópia desses métodos
	 */
	public static synchronized void imprimir() {

		System.out.println("O Thread " + Thread.currentThread().getName() + " está imprimindo");

		/**
		 * a mesma coisa que acima sincronizo o bloco e não o método, pode tirar o synchronized do método
		 */
		/*synchronized (ContaTeste.class) {
			System.out.println("Imprime");
		}
*/
	}

	/**
	 * Implementou Runnable, é necessário implementar o método run()
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
		System.out.println("Método de consulta");
	}

}
