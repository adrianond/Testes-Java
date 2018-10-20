package foreach.java.map;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("for normal, imprime chave e valor do mapa");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
			if("E".equals(entry.getKey())){
				System.out.println("Hello E " + entry.getValue());
				break;
			}
		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Lambda imprime chave e valor do mapa");
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Lambda imprime chave e valor do mapa, com mais de uma instrução");
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E " + v);
			}
		});
	}

}
