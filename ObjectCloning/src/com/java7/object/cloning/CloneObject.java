package com.java7.object.cloning;

class Clone implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Clone [i=" + i + ", j=" + j + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneObject {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Clone obj = new Clone();
		obj.i = 8;
		obj.j = 10;
		Clone obj1 = (Clone)obj.clone();
		System.out.println(obj1);
		System.out.println(obj1);
		System.out.println(obj+"  "+obj1);
		//Now after above steps if we do
		obj1.i=16;
		obj1.j=20;
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj+"  "+obj1);
		
	}
}
