package com.sarika.session.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		EmployeeAgeAndSalary obj1 = new EmployeeAgeAndSalary(10, "rahul", 5000.00, "Accounts");
		EmployeeAgeAndSalary obj2 = new EmployeeAgeAndSalary(20, "ajay", 6000.00, "Accounts");
		EmployeeAgeAndSalary obj3 = new EmployeeAgeAndSalary(30, "sulaiman", 7000.00, "HR");
		EmployeeAgeAndSalary obj4 = new EmployeeAgeAndSalary(40, "anshuman", 8000.00, "HR");
		
		List<EmployeeAgeAndSalary> dep = Arrays.asList(obj1,obj2,obj3,obj4);
		System.out.println(
		dep.stream().collect((Collectors.groupingBy(EmployeeAgeAndSalary::getDepartment,Collectors.summingDouble(e->e.getSalary())))
		));
		
		String s = "this is my name is this this";
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().parallel().filter(e->e%2==0).collect(Collectors.toList());
	}
}
