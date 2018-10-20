package teste.metod.reference.metodo.estatico;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceTeste {

	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(" Chama metodo estatico usando method reference");
		// Method reference
		list.forEach(StaticMethodReference::print);
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(" Chama metodo estatico usando lambda expression");
		// Lambda expression
		list.forEach(number -> StaticMethodReference.print(number));
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Chama metodo estatico de maneira 'norma'");
		// normal
		for (int number : list) {
			StaticMethodReference.print(number);
		}
	}

}
