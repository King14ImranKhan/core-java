package src.com.interview;

public class StringToInt {
public static void main(String[] args) {
	String str1="12";
	String str2 = "14";
	int length1 = str1.length();
	int length2 = str2.length();
	for(int i=0;i<=str1.length();i++) {
		int k =(str1.charAt(i)-48);
		System.out.println(k);
		break;
	}
	
}
}
