package src.com.interview;

class StaticExample{
	 static void f1(StaticExample obj) {
		obj.f2();
		System.out.println("Hello");
	}
	void f2() {
		System.out.println("Raj");
	}
}
public class StaticInsideNonStatic {
	public static void main(String[] args) {
		StaticExample obj = new StaticExample();
		StaticExample.f1(obj);
	}
}
