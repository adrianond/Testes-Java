package br.com.teste.dias.semana.interno;

public class EnumInternoTeste {

	public static void main(String[] args) {

		EnumInterno enumInterno = new EnumInterno();
		enumInterno.setDia(EnumInterno.DiaSemana.QUARTA.getValor());

		System.out.println(" Dia: " + enumInterno.getDia());
	}

}
