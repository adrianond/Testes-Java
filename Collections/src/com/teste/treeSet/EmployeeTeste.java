package com.teste.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTeste {

	public static void main(String[] args) {

		Set<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(104, "Arjun", 10000));
		ts.add(new Employee(105, "Dinesh", 50000));
		ts.add(new Employee(101, "John", 40000));
		ts.add(new Employee(102, "Krish", 44500));
		ts.add(new Employee(103, "Arun", 20000));
		// adding duplicate entry
		ts.add(new Employee(103, "Arun", 20000));
		// check if duplicate entry is there or not
		for (Employee e : ts) {
			Employee employee = new Employee();
			employee.setEmpId(e.getEmpId());
			employee.setEmpName(e.getEmpName());
			employee.setEmpSal(e.getEmpSal());
			System.out.println(employee.getEmpName());
		}
	}

}
