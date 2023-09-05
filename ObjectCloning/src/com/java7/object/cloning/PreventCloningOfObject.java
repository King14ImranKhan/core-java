package com.java7.object.cloning;

class SingletonClassExample implements Cloneable{
	static SingletonClassExample singletonexample = new SingletonClassExample();
	private SingletonClassExample(){
		
	}
	static SingletonClassExample getInstance() {
		return singletonexample;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone of this object not supported");
		//return super.clone(); 
	}
}
public class PreventCloningOfObject {
public static void main(String[] args) throws CloneNotSupportedException {
	SingletonClassExample obj1 =SingletonClassExample.getInstance();
	SingletonClassExample obj2 = SingletonClassExample.getInstance();
	System.out.println(obj1+"  "+obj2);
	SingletonClassExample obj3 = (SingletonClassExample) obj1.clone();
	System.out.println(obj3);
	
}
}
