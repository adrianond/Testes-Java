import java.util.Arrays;
import java.util.List;

public class ImprimePilha {

	public static void main(String[] args) {

		List<Integer> lista = (List) Arrays.asList(1, 2, 3);

		System.out.println("Imprime Fila");
		for (Integer i : lista) {
			System.out.println(i);
		}

		System.out.println("Imprime Pilha");

		for (int i = 0; i < lista.size(); i++) {
			int tamanho = lista.size();
			int controle = 1 + i;
			int indice = tamanho - controle;
			System.out.println(lista.get(indice));
		}
	}

}
