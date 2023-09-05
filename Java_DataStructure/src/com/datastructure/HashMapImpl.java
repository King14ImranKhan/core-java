package com.datastructure;

import java.util.LinkedList;

public class HashMapImpl {
	LinkedList<Entry>[] hashMap = new LinkedList[2];
	int size=0;
	public HashMapImpl() {
		
	}
	public void put(Key key,Value value) {
		if(size>=hashMap.length) {
			resize();
		}
		int ix = getIndex(key)%hashMap.length;
		if(hashMap[ix]==null) {
			hashMap[ix]=new LinkedList<>();
			hashMap[ix].add(new Entry(key,value));
			
			
		}
	}
}
