package teste.metod.reference.metodo.reference.constructor;

import java.time.LocalDate;
import java.util.Calendar;

public class Person {

	String name;
	String birthday;
	Sex gender;
	String emailAddress;

	public Person(String nome, String dataAniversario, Sex sexo, String email) {
		this.name = nome;
		this.birthday = dataAniversario;
		this.gender = sexo;
		this.emailAddress = email;
	}

	public enum Sex {
		MALE, FEMALE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}

}
