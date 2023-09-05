package com.java7.object.cloning;
//This is shallow cloning. Here we are not creating two objects we are hadling with Objects instance 

class Abc{
	
	int i;
	int j;
}
public class ShallowCloning {
	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.i=6;
		obj.j=8;
		System.out.println(obj.i+" "+obj.j);
		Abc obj1 = obj;
		//Above line is shallow cloning which means Change in clone object will reflect in original object because here we are not creating
		//two objects, just creating second reference for the object.Now if we have two references for same object then what will happen if we will
		//make changes then it will reflect in object.
		obj1.i=12;
		obj1.j=16;
		System.out.println(obj1.i+" "+obj1.j);
		System.out.println(obj.i+" "+obj.j);

	}
}
