package com.map.collision;

import java.util.HashMap;
import java.util.Map;

import hashmap.Employee;

public class CollisionHashMap {
 public static void main(String[] args) {
	Employee obj1 = new Employee("Siva",32);
	Employee obj2 = obj1;
	Employee obj3 = obj2;
	Map<Employee,String> map = new HashMap<>();
	map.put(obj1, "User1");
	map.put(obj2, "User2");
	map.put(obj3, "User3");
	for(Map.Entry<Employee, String> mapIterate : map.entrySet()) {
		System.out.println("Key : "+mapIterate.getKey()+" Value : "+mapIterate.getValue());
	}
}
}
