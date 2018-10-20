package teste.metod.reference.metodo.reference.constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodReference {

	public static void main(String args[]) {

		final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Instancia um objeto usando method reference");
		List<Integer> listRetornoMethodReference = (List<Integer>) copyElements(list, ArrayList<Integer>::new);
		System.out.println("Imprime a lista com method reference");
		listRetornoMethodReference.forEach(System.out::println);

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Instancia um objeto usando lambda");
		List<Integer> listRetornoLambda = (List<Integer>) copyElements(list, () -> new ArrayList<Integer>());
		System.out.println("Imprime a lista com lambda");
		listRetornoLambda.forEach(lista -> System.out.println(lista));
	}

	public static <Integer, Lista extends Collection<Integer>, NovaLista extends Collection<Integer>> NovaLista copyElements(Lista lista, Supplier<NovaLista> novaLista) {
		// percorre a lista e add na nova lista
		NovaLista result = novaLista.get();
		for (Integer t : lista) {
			result.add(t);
		}
		return result;
	}
}
