package com.java7.object.cloning;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToInitializeObjects implements Serializable , Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Both the name of the class and serialVersionUID are written to the ObjectOutputStream when we convert object into byte stream and 
	//during  deserialization again serialVersionUID will be generated and will be compared with the previously written serialVersionUID if there 
	//is mismatch then InValid class exception will be thrown.
	//Suppose after serialization you have made some changes in existing class now trying to deserialize byte stream to java object then it will
	//throw exception because it will not match previous serialVersionUID.
	private String name;
	private Integer id;
	private String classForNameMethod = "Class.forName() method with newInstance() method to create object dynamically";
	private String reflection = "Class.forName() method with newInstance() method to create object dynamically";

	public WaysToInitializeObjects() {
		super();
	}

	public WaysToInitializeObjects(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getClassForNameMethod() {
		return classForNameMethod;
	}

	public void setClassForNameMethod(String classForNameMethod) {
		this.classForNameMethod = classForNameMethod;
	}

	public String getReflection() {
		return reflection;
	}

	public void setReflection(String reflection) {
		this.reflection = reflection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 1st way
		WaysToInitializeObjects obj1 = new WaysToInitializeObjects("imran", 12);
		WaysToInitializeObjects obj2 = new WaysToInitializeObjects("amrita", 14);
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());

		// 2nd Way
		// Class.forName() will load the class dynamically and indirectly will give you
		// "Class object".Once the class is loaded we will be using new
		// newInance() method to create object dynamically.
		String className = "WaysToInitializeObjects";
		Class<WaysToInitializeObjects> classobj = (Class<WaysToInitializeObjects>) Class.forName(className);
		WaysToInitializeObjects obj3 = (WaysToInitializeObjects) classobj.newInstance();
		System.out.println(obj3.getClassForNameMethod());

		// Similar to newInstance() method of Class class.There is one newInstance()
		// method in the java.lang.reflect.Constructor class which we can
		// use to create objects. We can also call a parameterized constructor, and
		// private constructor by using this newInstance() method of
		// java.lang.reflect.Constructor class
		Constructor<WaysToInitializeObjects> obj4;
		try {
			obj4 = WaysToInitializeObjects.class.getConstructor();
			WaysToInitializeObjects obj5 = obj4.newInstance();
			System.out.println(obj5.getReflection());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		// Through clone() method  we can instantiate object
		WaysToInitializeObjects clone = new WaysToInitializeObjects("Ramesh",199);
		try {
			WaysToInitializeObjects clone2 = (WaysToInitializeObjects) clone.clone();
			System.out.println(clone2.getName());
			System.out.println(clone2.getId());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
