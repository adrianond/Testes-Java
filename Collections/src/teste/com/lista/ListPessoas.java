package teste.com.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import teste.com.pessoa.Pessoa;
import teste.com.pessoa.Pessoa2;

/***
 * Ordena a lista por ordem definida pelo tamanho do nome
 * @author 660454
 *
 */
public class ListPessoas {
	
	public static void main(String[] args) {
		
		List<Pessoa> listPessoa = Arrays.asList(new Pessoa("Adriano", "Dantas", 10), new Pessoa("Adriano", "Dantas", 10), new Pessoa("Felipe", "Coelho" ,3), new Pessoa("Joao", "Silva", 7), new Pessoa("Cesar", "Castilho", 8));
		List<Pessoa2> listPessoa2 = Arrays.asList(new Pessoa2("Adriano", "Dantas"), new Pessoa2("Adriano", "Dantas"), new Pessoa2("Felipe", "Coelho"), new Pessoa2("Joao", "Silva"), new Pessoa2("Cesar", "Castilho"));
		
		System.out.println("Classe Pessoa implementa Comparable para ordenar a lista pela idade da pessoa");
		Collections.sort(listPessoa);		
		listPessoa.forEach((Pessoa p) -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(p.getNome());
			pessoa.setSobrenome(p.getSobrenome());
			System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome());
		});
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Uso o método sort de que ArrayList contém e que recebe um comparator como parametro para ordenar a lista ");
		List<Pessoa2> retorno = listaOrdenadaMenosCodigoComparator(listPessoa2);
		 
		 retorno.forEach((Pessoa2 p) -> {
			String nome = p.getNome();
			System.out.println(nome);
		 });
		
	}
	
	
	private static List<Pessoa2> listaOrdenadaMenosCodigoComparator(List<Pessoa2> listPessoa2) {

		Comparator<Pessoa2> comparator = (p1, p2) -> 
			 Integer.compare(p1.getNome().length(), p2.getNome().length());
		
			 //listPessoa2.sort(comparator);
			 //ou
			Collections.sort(listPessoa2, (p1, p2) -> Integer.compare(p1.getNome().length(), p2.getNome().length()));
		return listPessoa2;
	}
}
