package com.java7.object.cloning;

class Deep{
	int i;
	int j;
}
public class DeepCloning  {
	public static void main(String[] args) {
		Deep obj = new Deep();
		obj.i=5;
		obj.j=6;
		Deep obj1 = new Deep();
		obj1.i=obj.i; //In Deep cloning we are creating two objects by initialization(line 8 and 11).
						//and copying one one value. 
						//In Deep cloning ,changes will not reflect in original object because we are considering object variables.
		obj1.j=obj.j;
		obj1.i=10;
		obj1.j=16;
		System.out.println(obj.i+" "+obj.j);
		System.out.println(obj1.i+" "+obj1.j);
		
	}

}
