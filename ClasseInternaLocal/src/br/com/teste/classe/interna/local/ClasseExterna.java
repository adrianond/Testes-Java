package br.com.teste.classe.interna.local;

public class ClasseExterna {

	public void teste() {
		/**
		 * Classe local:muito utilizada para actions de Swing
		 * 
		 * @author 660454
		 *
		 */
		class ClasseLocal {

			public void imprimir() {
				System.out.println("Metodo  da classe Local");
			}
		}
		ClasseLocal local = new ClasseLocal();
		local.imprimir();
	}

	/**
	 * Vamos supor que temos um metodo muito grande, podemos dividir a lógica desse método e mais 
	 * método em uma classe, neste caso uma Inner Class
	 * @param numero
	 * @param number
	 * @return
	 */
	private int somar(int numero, int number) {

		class ClassInner {

			private int valor() {
				int soma =  numero + number;
				return retorno(soma);
			}

			private int retorno(int soma) {
				return soma * 2;
			}
		}
		ClassInner interna = new ClassInner();
		return interna.valor();
	}
	
	public static void main(String[] args) {
		
		ClasseExterna externa = new ClasseExterna();
		int resultado = externa.somar(10, 10);
		System.out.println(resultado);
	}
}
