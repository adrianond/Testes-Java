package com.teste.treeSet;

import java.util.Comparator;

public class CityComparatorString implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}
