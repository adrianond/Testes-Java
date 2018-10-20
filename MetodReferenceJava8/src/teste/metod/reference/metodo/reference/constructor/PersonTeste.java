package teste.metod.reference.metodo.reference.constructor;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class PersonTeste {

	public static void main(String[] args) {

		List list = Arrays.asList(new Person("Adriano", "20/02/1985", Person.Sex.MALE, "adriano@teste.com.br"),
				new Person("Paula", "14/01/1998", Person.Sex.FEMALE, "paula@teste.com.br"),
				new Person("Pedro", "10/02/1978", Person.Sex.MALE, "pedro@teste.com.br"));

		// we are using method reference to create a instance of HashSet of listPerson
		HashSet<Person> set = transferElements(list, HashSet<Person>::new);
		set.forEach(p -> System.out.println("nome: " + p.getName() + "; data de nascimento: " + p.getBirthday()
				+ "; sexo: " + p.getGender() + "; email: " + p.getEmailAddress()));
	}

	/**
	 * 
	 * @param sourceCollection
	 * @param collectionFactory
	 * @return
	 */
	public static <Person, Lista extends Collection<Person>, HashSet extends Collection<Person>> HashSet transferElements(Lista lista,
			Supplier<HashSet> hashSet) {

		HashSet result = hashSet.get();
		for (Person p : lista) {
			result.add(p);
		}
		return result;
	}
}
