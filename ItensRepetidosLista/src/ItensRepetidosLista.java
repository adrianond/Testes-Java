import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItensRepetidosLista {

	static String valor = "";
	private static List<String> listRepetidos = new ArrayList<>();
	private static List<String> listaConcatenda = new ArrayList<String>();

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("C");
		items.add("D");
		items.add("E");
		items.add("E");
		
	   List<String> segundaLista = Arrays.asList("A","A","B","C","C","D","E","E");
	   List<String> terceiraLista = Arrays.asList("A","B","E");
	   List<String> quartaLista = Arrays.asList("A","B","C","D");
	   
	   

		//List<String> resultado = imprimeRepetido(items);
		//List<String> resultado = imprimeSemRepetido2(items, segundaLista);
	  // List<String> resultado = imprimeRepetido3(terceiraLista, quartaLista);
		List<String> resultado = imprimeSemRepetidosDuasListas(terceiraLista, quartaLista);
		System.out.println(resultado);
		System.out.println(resultado.size());

	}

	private static List<String> imprimeSemRepetidosDuasListas(List<String> terceiraLista, List<String> quartaLista) {
		listaConcatenda.addAll(terceiraLista);
		listaConcatenda.addAll(quartaLista);
		for (int i = 0; i < listaConcatenda.size(); i++) {
			 String indiceAtual = listaConcatenda.get(i);
		  for (int j = i + 1; j < listaConcatenda.size(); j++) {
		     String proximoElemento = listaConcatenda.get(j);
		       if (indiceAtual.equals(proximoElemento)) {
		    	   listaConcatenda.remove(j);
		       }
		  }
		}
		return listaConcatenda;
	}

	private static List<String> imprimeRepetido(List<String> items) {
		for (int i = 0; i < items.size(); i++) {
			String atual = items.get(i);
			for (int j = i + 1; j < items.size(); j++) {
				String proxima = items.get(j);
				if (atual.equals(proxima)) {
					valor = atual;
					listRepetidos.add(valor);
				}
			}
		}
		return listRepetidos;
	}

	private static List<String> imprimeSemRepetido2(List<String> items, List<String> segundaLista) {
		for (int i = 0; i < items.size(); i++) {
			String atual = items.get(i);
			for (int j = 0; j < segundaLista.size(); j++) {
				String proxima = segundaLista.get(j);
				if (atual.equals(proxima)) {
					items.remove(i);
				}
			}
		}
		return items;
	}

	private static List<String> imprimeRepetido3(List<String> items, List<String> segundaLista) {
		for (int i = 0; i < items.size(); i++) {
			String atual = items.get(i);
			for (int j = 0; j < segundaLista.size(); j++) {
				String proxima = segundaLista.get(j);
				if (atual.equals(proxima)) {
					valor = atual;
					listRepetidos.add(valor);
				}
			}
		}
		return listRepetidos;
	}

}