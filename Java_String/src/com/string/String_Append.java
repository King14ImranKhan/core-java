package com.string;
/*StringBuffer is synchronized and StringBuild is non-synchronized
 *StringBuilder and StringBuffer has append method, remember these two
 *are mutable.
 *It appends a char or char sequence to a string.
 *It will not create a new object, since it is a mutable one.*/
public class String_Append {
	public static void main(String[] args) {
		 //Appending string to string
		 StringBuilder helloStrBuilderVariable = new StringBuilder("hello");
		 StringBuilder worldStrBuilderVariable = new StringBuilder(" world");
		 System.out.println(helloStrBuilderVariable.append(worldStrBuilderVariable)); //prints hello world
		 //Appending char to string
		 StringBuilder charVariable = new StringBuilder("Ng");
		 System.out.println(charVariable.append("Developer")); // prints JavaD
		 }
}
