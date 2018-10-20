package teste.com.mapa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import teste.com.pessoa.Pessoa;

public class MapPessoas {
	
	public static void main(String[] args) {
		
		List<Pessoa> listPessoa = Arrays.asList(new Pessoa("Adriano", "Dantas", 1), new Pessoa("Adriano", "Dantas", 1), new Pessoa("Felipe", "Coelho", 3), new Pessoa("Joao", "Silva", 10), new Pessoa("Cesar", "Castilho", 6));
		List<Pessoa> listPessoa2 = Arrays.asList(new Pessoa("Adriano", "Dantas", 1), new Pessoa("Adriano", "Dantas", 1), new Pessoa("Felipe", "Coelho", 3), new Pessoa("Joao", "Silva", 10), new Pessoa("Cesar", "Castilho", 6));
		
		Map<String, List<Pessoa>> mapa = new HashMap<String, List<Pessoa>>();
		mapa.put("pessoa1", listPessoa);
		mapa.put("pessoa2", listPessoa2);
		
		mapa.forEach((chave,valor) ->{
			valor.forEach((Pessoa p) -> {
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(p.getNome());
				pessoa.setSobrenome(p.getSobrenome());
				System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome());
			});
		});
		
		System.out.println("------------------------------------------------------------");
		
		for (Map.Entry<String, List<Pessoa>> map : mapa.entrySet()) {
			List<Pessoa> list = map.getValue();
			for (Pessoa pessoa : list) {
				Pessoa p = new Pessoa();
				p.setNome(pessoa.getNome());
				p.setSobrenome(pessoa.getSobrenome());
				System.out.println(p.getNome() + " " + p.getSobrenome());
			}
		}
	}
}
