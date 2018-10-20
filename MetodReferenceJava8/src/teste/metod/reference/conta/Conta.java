package teste.metod.reference.conta;

public class Conta {

	private int numero;
	private String titular;

	public Conta() {

	}

	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}
	
	@Override
    public String toString() {
        return "Conta{titular:"+titular+", numero:"+numero+"}";
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
