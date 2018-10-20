package teste.metod.reference.metod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyComparatorTeste {

	public static void main(String[] args) {
		
		final List<Integer> list = Arrays.asList(10, 2, 9, 4, 5, 6, 7, 8, 2, 1);
		
		final MyComparator myComparator = new MyComparator();
		
		System.out.println(" Chama metodo da classe MyComparator usando method reference");
		// Method reference
		Collections.sort(list, myComparator::compare);
		list.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
		
		System.out.println(" Chama metodo da classe MyComparator usando lambda expression");
		// Lambda expression
		Collections.sort(list, (a, b) -> myComparator.compare(a, b));
		//Collections.sort(list, (a, b) -> new MyComparator().compare(a, b));
		list.forEach(System.out::println);
	}

}
