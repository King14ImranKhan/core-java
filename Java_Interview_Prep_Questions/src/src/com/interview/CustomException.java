package src.com.interview;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
public class CustomException {
	static void validate(int age) throws MyException {
		if (age < 18) {
			throw new MyException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String args[]) {
		try {
			validate(13);
		} catch (MyException ex) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured: " + ex);
		}
		System.out.println("rest of the code...");
	}
}
