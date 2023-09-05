package comparable.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("imran");
		list.add("aman");
		list.add("bablu");
		List<String> obj = list.stream().sorted().collect(Collectors.toList());
		System.out.println(obj);
		List<String> obj2 = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(obj2);
		List<String> obj3 = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(obj3);
		List<EmployeeDetails> emp = new ArrayList<>();
		emp.add(new EmployeeDetails("imran", 32, 35000));
		emp.add(new EmployeeDetails("aman", 30, 32000));
		emp.add(new EmployeeDetails("rahul", 38, 38000));
		List<EmployeeDetails> empDetail = emp.stream()
				.sorted((obj4, obj5) -> (int) (obj4.getSalary() - obj5.getSalary())).collect(Collectors.toList());
		System.out.println(empDetail);
		List<EmployeeDetails> empDetail2 = emp.stream().sorted((Comparator.comparingDouble(EmployeeDetails::getSalary)))
				.collect(Collectors.toList());
		System.out.println(empDetail2);
		List<EmployeeDetails> empDetail3 = emp.stream()
				.sorted((Comparator.comparingDouble(EmployeeDetails::getSalary).reversed()))
				.collect(Collectors.toList());
		System.out.println(empDetail3);
		
		List<EmployeeDetails> incrementedSalary = emp.stream().map(e -> {
			if (e.getSalary() > 35000) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(incrementedSalary);
		List<Object> age = emp.stream().map(e -> {
			if (e.getAge() > 31) {
				 e.setAge(e.getAge());
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(age);
	}
}
