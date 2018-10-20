package teste.metod.reference.metodo.estatico.arbitrary.object;

import java.util.Arrays;
import java.util.List;

public class ArbytraryObjectTeste {

	public static void main(String[] args) {

		final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
		
		System.out.println(" Method reference:");
		// Method reference
		people.forEach(Person::printName);
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Lambda:");
		// Lambda expression
		people.forEach(person -> person.printName());
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("For normal");
		// normal
		for (final Person person : people) {
			person.printName();
		}
	}
}
