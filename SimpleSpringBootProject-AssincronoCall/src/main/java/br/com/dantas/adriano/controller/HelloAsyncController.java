package br.com.dantas.adriano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.dantas.adriano.service.AsyncService;

@RestController
public class HelloAsyncController {

	@Autowired
	private AsyncService helloService;

	@RequestMapping("/")
	public String hello() {
		String mensagemRetorno = "Sucesso na primeira chamada!";
		try {
			helloService.hello();
		} catch (InterruptedException e) {
			mensagemRetorno = "Erro.";
		}
		return mensagemRetorno;
	}

}
