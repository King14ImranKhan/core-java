package com.sarika.session.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvaerageAgeAboveThresholdSalary {
	public static void main(String[] args) {
		EmployeeAgeAndSalary obj1 = new EmployeeAgeAndSalary(10, null, 5000.00, null);
		EmployeeAgeAndSalary obj2 = new EmployeeAgeAndSalary(20, null, 6000.00, null);
		EmployeeAgeAndSalary obj3 = new EmployeeAgeAndSalary(30, null, 7000.00, null);
		EmployeeAgeAndSalary obj4 = new EmployeeAgeAndSalary(40, null, 8000.00, null);
		List<EmployeeAgeAndSalary> result= Arrays.asList(obj1,obj2,obj3,obj4);
		System.out.println(
		result.stream().filter(e->e.getSalary()>5000.00).collect(Collectors.summarizingInt(e->e.getAge())).getAverage()
		);
	}
}
