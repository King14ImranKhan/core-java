package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int age;
	private String name;
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
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
}
public class CollectorsToMap {
	public static void main(String[] args) {
		Employee emp1 = new Employee(14, "rahul");
		Employee emp2 = new Employee(15, "aman");
		List<Employee> obj = Arrays.asList(emp1,emp2);
		Map<Object, Object> map = obj.stream().collect(Collectors.toMap(e->e.getName(), e->e.getAge()));
		System.out.println(map);
		map.forEach((k,v)->System.out.println("k "+k+" "+v));
		
	}
}
