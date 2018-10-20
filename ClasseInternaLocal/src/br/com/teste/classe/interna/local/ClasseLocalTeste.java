package br.com.teste.classe.interna.local;

public class ClasseLocalTeste {

	public static void main(String[] args) {
		ClasseExterna externa = new ClasseExterna();
		//externa.teste();
		
		int resultado = externa.somar(10, 10);
		System.out.println(resultado);
	}
}
