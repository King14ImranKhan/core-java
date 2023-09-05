package com.basic.questions;
import java.util.Date;

// An Object whose content can not be changed
// Sometime we want to create an object whose content can not be changed once the object has 
// been created. Such an object is called an immutable object and its class is an immutable
// class.
final class ClassWithDateField {
	private final String name;
	private final Date date;

	public ClassWithDateField(String name, Date date) {
		super();
		this.name = name;
		this.date = new Date(date.getTime());
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	@Override
	public String toString() {
		return "ClassWithDateField [name=" + name + ", date=" + date + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ImmutableClassWithDateField {
	public static void main(String[] args) {
		ClassWithDateField obj = new ClassWithDateField("imran", new java.util.Date());
		Date obj3 = obj.getDate();
		char[] obj2 = obj.getName().toCharArray();
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
