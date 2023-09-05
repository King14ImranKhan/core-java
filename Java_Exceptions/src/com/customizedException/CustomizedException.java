package com.customizedException;

class UnderAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2873606593880953474L;

	UnderAgeException(){
		super("You are under age");
	};
	
}
public class CustomizedException {
	public static void main(String[] args)  {
		int age =16;
		//int age = 19;
		if(age<18) {
			try {
			throw new UnderAgeException();
			}catch(UnderAgeException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Age is ok");
		}
	}

}
