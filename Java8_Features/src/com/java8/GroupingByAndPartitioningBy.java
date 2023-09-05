package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import comparable.comparator.EmployeeDetails;

public class GroupingByAndPartitioningBy {
	public static void main(String[] args) {
		EmployeeDetails obj1 = new EmployeeDetails("rahul", 16, 55000);
		EmployeeDetails obj2 = new EmployeeDetails("imran", 20, 225000);
		EmployeeDetails obj3 = new EmployeeDetails("shankar", 16, 15000);
		EmployeeDetails obj4 = new EmployeeDetails("aman", 19, 25000);

		List<EmployeeDetails> list = Arrays.asList(obj1, obj2, obj3, obj4);
		
		Map<Boolean, List<EmployeeDetails>> map = list.stream()
				.collect(Collectors.partitioningBy(e->e.getSalary()>25000));
		
		map.forEach((k, v) -> System.out.println("Key is " + k + " Value is " + v));
		
		list.stream().collect(Collectors.groupingBy(e -> e.getAge()))
				.forEach((k, v) -> System.out.println("Employeee age is " + k + " Details are " + v));
	}
}
