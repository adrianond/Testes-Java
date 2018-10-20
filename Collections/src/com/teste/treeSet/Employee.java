package com.teste.treeSet;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private int empSal;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int sal) {
		this.empId = id;
		this.empName = name;
		this.empSal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String toString() {
		return empId + " : " + empName + " : " + empSal;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.empId == emp.getEmpId()) {
			return 0;
		} else if (this.empId < emp.getEmpId()) {
			return -1;
		}
		return 1;
	}

}
