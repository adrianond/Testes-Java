package com.teste.treeSet;

import java.util.TreeSet;

public class CityTeste {

	public static void main(String[] args) {
	    TreeSet<City> set = new TreeSet<City>(new CityComparatorInt());
		//TreeSet<City> set = new TreeSet<City>(new CityComparatorString());
		set.add(new City(1, "Vijayawada"));
		set.add(new City(5, "Mumbai"));
		set.add(new City(4, "Visakhapatnam"));
		set.add(new City(2, "Delhi"));
		set.add(new City(1, "Vijayawada"));
		
		set.forEach((City c) -> {
			City cidade = new City();
			cidade.setId(c.getId());
			cidade.setCity(c.getCity());
			System.out.println(cidade.getId()+ " " + cidade.getCity());
		});
	}

}
