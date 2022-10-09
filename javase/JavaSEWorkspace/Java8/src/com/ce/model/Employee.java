package com.ce.model;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, salary=%s]", empId, empName, salary);
	}

	@Override
	public int compareTo(Employee other) {
		return empName.compareTo(other.empName);
	}
	
}
