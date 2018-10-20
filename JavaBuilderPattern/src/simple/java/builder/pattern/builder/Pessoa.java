package simple.java.builder.pattern.builder;

public class Pessoa {

	private String nome;
	private String endereco;
	private String compplemento;
	private String cidade;
	private String pais;
	private int idade;

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCompplemento() {
		return compplemento;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa() {
		
	}

	/**
	 * 
	 * @param builder
	 */
	private Pessoa(PessoaBuilder builder) {
		this.nome = builder.nome;
		this.endereco = builder.endereco;
		this.compplemento = builder.compplemento;
		this.cidade = builder.cidade;
		this.pais = builder.pais;
		this.idade = builder.idade;
	}

	public static class PessoaBuilder {

		private String nome;
		private String endereco;
		private String compplemento;
		private String cidade;
		private String pais;
		private int idade;
		
		
		public PessoaBuilder() {
			
		}

		/**
		 * 
		 * @param nome
		 * @param endereco
		 * @param complemento
		 * @param cidade
		 * @param pais
		 * @param idade
		 */
		public PessoaBuilder(String nome, String endereco, String complemento, String cidade, String pais, int idade) {
			this.nome = nome;
			this.endereco = endereco;
			this.compplemento = complemento;
			this.cidade = cidade;
			this.pais = pais;
			this.idade = idade;
		}

		/**
		 * @param nome
		 *            the nome to set
		 */
		public PessoaBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		/**
		 * @param endereco
		 *            the endereco to set
		 */
		public PessoaBuilder setEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		/**
		 * @param compplemento
		 *            the compplemento to set
		 */
		public PessoaBuilder setCompplemento(String compplemento) {
			this.compplemento = compplemento;
			return this;
		}

		/**
		 * @param cidade
		 *            the cidade to set
		 */
		public PessoaBuilder setCidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		/**
		 * @param pais
		 *            the pais to set
		 */
		public PessoaBuilder setPais(String pais) {
			this.pais = pais;
			return this;
		}

		/**
		 * @param idade
		 *            the idade to set
		 */
		public PessoaBuilder setIdade(int idade) {
			this.idade = idade;
			return this;
		}
        
		public Pessoa build() {
			return new Pessoa(this);
		}
	}
}
