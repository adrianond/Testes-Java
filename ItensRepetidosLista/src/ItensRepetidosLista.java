import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItensRepetidosLista {

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

		List<String> terceiraLista = Arrays.asList("A", "B","E","E");
		List<String> quartaLista = Arrays.asList("A", "B", "C", "D");

		imprimeValoresRepetidos(items);
		removeRepetidos(items);
		imprimeValoresRepetidoDeDuasListas(terceiraLista, quartaLista);
		imprimeSemRepetidosDuasListas(terceiraLista, quartaLista);
}
		
	/**
	 * Remove os elementos repetidos em duas listas, imprime elementos com
	 * apenas uma ocorrencia
	 * 
	 * @param terceiraLista
	 * @param quartaLista
	 * @return
	 */
	private static void imprimeSemRepetidosDuasListas(List<String> terceiraLista, List<String> quartaLista) {
		
		List<String> listaConcatenda = new ArrayList<String>();
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
		System.out.println("Remove valores repetidos de duas listas e imprime em outra lista");
		System.out.println(listaConcatenda);
		System.out.println(listaConcatenda.size());
		System.out.println("------------------------------------------------------------------------------");
	}

	/**
	 * cria uma lista com apenas os valores repetidos de outra lista
	 * 
	 * @param items
	 * @return
	 */
	private static void imprimeValoresRepetidos(List<String> items) {

		List<String> listRepetidos = new ArrayList<>();

		for (int i = 0; i < items.size(); i++) {
			String atual = items.get(i);
			for (int j = i + 1; j < items.size(); j++) {
				String proxima = items.get(j);
				if (atual.equals(proxima)) {
					listRepetidos.add(proxima);
				}
			}
		}
		System.out.println("Imprime valores repetidos de uma lista");
		System.out.println(listRepetidos);
		System.out.println(listRepetidos.size());
		System.out.println("------------------------------------------------------------------------------");
	}

	/**
	 * Remove os valores repetidos da lista
	 * 
	 * @param items
	 * @return
	 */
	private static void removeRepetidos(List<String> items) {

		for (int i = 0; i < items.size(); i++) {
			String atual = items.get(i);
			for (int j = i + 1; j < items.size(); j++) {
				String proxima = items.get(j);
				if (atual.equals(proxima)) {
					items.remove(j);
				}
			}
		}
		System.out.println("Remove os valores repetidos da lista");
		System.out.println(items);
		System.out.println(items.size());
		System.out.println("------------------------------------------------------------------------------");
	}

	/**
	 * Cria uma terceira lista com os valores que são repetidos em duas listas
	 * 
	 * @param items
	 * @param segundaLista
	 * @return
	 */
	private static void imprimeValoresRepetidoDeDuasListas(List<String> items, List<String> segundaLista) {

		List<String> listRepetidos = new ArrayList<>();

		for (int i = 0; i < items.size(); i++) {
			String valuePrimeiraLista = items.get(i);
			for (int j = 0; j < segundaLista.size(); j++) {
				String valueSegundaLista = segundaLista.get(j);
				if (valuePrimeiraLista.equals(valueSegundaLista)) {
					listRepetidos.add(valueSegundaLista);
				}
			}
		}
		System.out.println("Cria uma terceira lista com os valores que são repetidos em duas listas");
		System.out.println(listRepetidos);
		System.out.println(listRepetidos.size());
		System.out.println("------------------------------------------------------------------------------");
	}

}