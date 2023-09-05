package com.basic.questions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Example{
	public String m1(String str) {
		Map<String,String> map = new HashMap<String, String>();
		map.put(str, "rahul");
		System.out.println(map.get("imran").hashCode());
		map.put(str, "jain");
		return "ooooo"+map.get("imran").hashCode()+"Value"+map.get("imran");
	}
}

public class HashMapExample {
	public static void main(String[] args) {
		/*Map<String,String> map = new HashMap<String, String>();
		map.put("imran", "rahul");
		System.out.println("iimram"+map.get("imran").hashCode());
		map.put("imran", "jain");
		System.out.println("oimram"+map.get("imran").hashCode());
		
		System.out.println(map.get("imran").hashCode());
		for (Map.Entry<String,String> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		System.out.println("ooo"+map.get("imran"));
		Set<String> s1 = new HashSet<String>();
		s1.add("umesh");
		//System.out.println(s1.get("umesh"));*/
		Example ex = new Example();
		System.out.println(ex.m1("imran"));
		
	}
}
