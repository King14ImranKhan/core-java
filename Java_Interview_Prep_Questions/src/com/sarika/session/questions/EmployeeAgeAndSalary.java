package com.sarika.session.questions;

public class EmployeeAgeAndSalary {
	private int age;
	private String name;
	private Double salary;
	private String department;
	public EmployeeAgeAndSalary(int age, String name, Double salary, String department) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeAgeAndSalary [age=" + age + ", name=" + name + ", salary=" + salary + ", department="
				+ department + "]";
	}

	

}
