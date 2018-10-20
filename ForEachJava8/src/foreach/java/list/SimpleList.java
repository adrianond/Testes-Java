package foreach.java.list;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.add("ContemX");
		
		remove(items);
		System.out.println("------------------------------------------------------------------------------------------------");

		System.out.println("for normal");
		for (String item : items) {
			System.out.println(item);
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Lambda");
		items.forEach(item -> System.out.println(item));

		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Lambda com mais de uma instrução");
		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

	}

	private static void remove(List<String> items) {
		System.out.println("remove all items which contains an X");
		items.removeIf(s-> s.contains("X"));
		System.out.println(items);
		
	}

}
