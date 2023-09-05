package src.com.design.pattern;

public class NullPointer {
public static void main(String[] args) {
	try {
		throw new NullPointerException();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
