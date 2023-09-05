package com.multithreading.basicConcept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*The try-with-resources statement is a try statement that declares one or more resources. A 
 * resource is an object that must be closed after the program is finished with it. The 
 * try-with-resources statement ensures that each resource is closed at the end of the 
 * statement. Any object that implements java.lang.AutoCloseable, which includes all objects
 *  which implement java.io.Closeable, can be used as a resource.
 */
public class TryWithResource {
	static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    }
	}

/*In this example, the resources declared in the try-with-resources statement are a FileReader
 *  and a BufferedReader. The declaration statements of these resources appear within parentheses
 *   immediately after the try keyword. The classes FileReader and BufferedReader, in Java SE 7
 *    and later, implement the interface java.lang.AutoCloseable. Because the FileReader and 
 *    BufferedReader instances are declared in a try-with-resource statement, they will be 
 *    closed regardless of whether the try statement completes normally or abruptly (as a 
 *    result of the method BufferedReader.readLine throwing an IOException).
 */

/*Prior to Java SE 7, you can use a finally block to ensure that a resource is closed regardless
 *  of whether the try statement completes normally or abruptly. The following example uses a 
 *  finally block instead of a try-with-resources statement:
 */
	static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
		   
	    FileReader fr = new FileReader(path);
	    BufferedReader br = new BufferedReader(fr);
	    try {
	        return br.readLine();
	    } finally {
	        br.close();
	        fr.close();
	    }
	}
}
