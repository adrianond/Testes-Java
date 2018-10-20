package simple.java.builder.pattern.builder.teste;

import simple.java.builder.pattern.builder.Pessoa;

public class PessoaBuilderTeste {
	
	public static void main(String[] args) {
		
		Pessoa  p = new Pessoa.PessoaBuilder()
				.setCidade("Sao Paulo")
				.setCompplemento("Apt 95")
				.setEndereco("Avenida das Coisa 40")
				.setIdade(40)
				.setNome("Frederico Nunes")
				.setPais("Brasil")
				.build();
		
		System.out.println(p.getCidade());
		
		Pessoa p2 =  new Pessoa.PessoaBuilder("Frederico Nunes", "Avenida das Coisa 40", "Apt 95", "Sao Paulo", "Brasil", 40).build();
		
		System.out.println(p2.getIdade());
	}
}
