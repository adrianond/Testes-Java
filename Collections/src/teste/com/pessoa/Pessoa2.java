package teste.com.pessoa;

public class Pessoa2 {

	private String nome;
	private String sobrenome;

	public Pessoa2() {
	}

	public Pessoa2(String name, String sobreNome) {
		this.nome = name;
		this.sobrenome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
