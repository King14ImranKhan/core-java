package com.java7.object.cloning;
//Make class as final
//Make variable as private
//Make variable as final 
//No setter method
//Make Deep copy for object
class Engine{
	int speed;
	Engine(int speed){
		this.speed = speed;
	}
}
public final class ImmutableClass {
	private final Engine engine;
	private final int id;
	private final String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ImmutableClass(int id, String name,Engine e){
		super();
		this.id = id;
		this.name = name;
		Engine engine = new Engine(e.speed);
		this.engine=engine;
	}
	public static void main(String[] args) {
		Engine e = new Engine(50);
		ImmutableClass obj = new ImmutableClass(1, "Java", e);
		System.out.println(obj.name=="Java");
		System.out.println(obj.engine.speed);
		e.speed=90;
		System.out.println(e);
		System.out.println(obj.engine.speed);
		
	}
}
