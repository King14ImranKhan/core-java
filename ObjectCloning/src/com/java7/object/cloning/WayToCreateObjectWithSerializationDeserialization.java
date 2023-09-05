package com.java7.object.cloning;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WayToCreateObjectWithSerializationDeserialization {
	public static void main(String[] args) {
		String filepath = "Sample.txt";
		WaysToInitializeObjects obj = new  WaysToInitializeObjects("serialization",24);
		try {
			// First we serialize a object to file
			FileOutputStream fop = new FileOutputStream(filepath);
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			// Deserialize back to object
			FileInputStream fis = new FileInputStream(filepath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			WaysToInitializeObjects object = (WaysToInitializeObjects)ois.readObject();
			ois.close();
			System.out.println(object.getName());
			System.out.println(object.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
