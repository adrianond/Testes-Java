package br.com.teste.dias.semana.interno;

public class EnumInterno {

	private int dia;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public enum DiaSemana {

		SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

		private int valor;

		DiaSemana(int valor) {
			this.valor = valor;
		}

		public int getValor() {
			return valor;
		}
	}

}
