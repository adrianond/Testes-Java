package br.com.teste.dias.semana.metodos.value.valueOf;

public class DiaSemanaTeste {

	public static void main(String[] args) {

		//retorna um array com os valores do enum
		DiaSemana[] dias = DiaSemana.values();

		for (DiaSemana dia : dias) {
			System.out.println("Array enum: " + dia);
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//retona um enum contendo o valor da string passada como parametro
		DiaSemana dia = DiaSemana.valueOf(DiaSemana.class, "QUARTA");
		System.out.println("Objeto enum : " + dia);
	}

}
