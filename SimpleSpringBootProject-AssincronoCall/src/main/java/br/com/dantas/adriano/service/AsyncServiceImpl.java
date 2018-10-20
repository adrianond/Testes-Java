package br.com.dantas.adriano.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

	/**
	 * @Async para dizer ao Spring que o método hello() deve ser executado de forma assíncrona
	 */
	@Async
	public void hello() throws InterruptedException {

		Thread.sleep(20000);
		System.out.println("Hello Async!");
	}
}
