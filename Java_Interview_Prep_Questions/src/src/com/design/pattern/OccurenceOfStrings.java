package src.com.design.pattern;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfStrings {
	public static void main(String[] args) {
		/*
		 * LinkedList<Integer> list = new LinkedList<>(); LinkedList<Integer> result =
		 * new LinkedList<>(); list.add(4); list.add(5); list.add(6); list.add(7);
		 * list.stream().map(e -> { for (int i = list.size() - 1; i >= 0; i--) {
		 * result.add(list.get(i)); } return e;
		 * 
		 * }).collect(Collectors.toList());
		 */

		String s = "abcAbc";
		int count=0;
		Map<String,Integer> obj = new HashMap<>();
		String[] h =s.split("");
		for(int i=0;i<h.length;i++){
			for(int j=i+1;j<h.length;j++) {
				if(h[i].equalsIgnoreCase(h[j])){
					count =count+1;
				}
				
			}
			obj.put(s, count);
			System.out.println(obj);
		}
	
	}
}
