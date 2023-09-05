package src.com.interview;
class Singleton {
	static Singleton obj = new Singleton();

	private Singleton() {
		super();
	}
	static synchronized Singleton getIntance() {
		return obj;
	}
}
public class SingletonPattern {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.obj;
		Singleton obj2 = Singleton.obj;
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
//Use the Singleton pattern when a class in your program should have just a single instance 
//available to all clients; for example, a single database object shared by different parts of 
//the program.