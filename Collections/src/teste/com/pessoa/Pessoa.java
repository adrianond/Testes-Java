package teste.com.pessoa;

/**
 * Estou implementando comparable por causa do TreeSet : TreeSetPessoas.class
 * 
 * @author 660454
 *
 */
public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa() {
	}

	public Pessoa(String name, String sobreNome, int idade) {
		this.nome = name;
		this.sobrenome = sobreNome;
		this.idade = idade;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa p) {
		if (this.idade == p.getIdade()) {
			return 0;
		} else if (this.idade < p.getIdade()) {
			return -1;
		}
		return 1;
	}

}
