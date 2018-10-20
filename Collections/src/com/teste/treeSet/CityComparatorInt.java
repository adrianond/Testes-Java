package com.teste.treeSet;

import java.util.Comparator;

public class CityComparatorInt implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {

		if (o1.id == o2.id) {
			return 0;
		} else if (o1.id > o2.id) {
			return 1;
		} else {
			return -1;
		}
	}

}
