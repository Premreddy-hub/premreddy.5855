package com.hcl.dy5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {

	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin = new FileInputStream("c:/files/employ.txt");
			
			ObjectInputStream objin = new ObjectInputStream(fin);
			Employ e = (Employ)objin.readObject();
			System.out.println(e);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
