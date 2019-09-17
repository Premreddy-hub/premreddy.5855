package com.hcl.dy5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Objinex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin =
			new FileInputStream("c:/files/objout.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);   
			String s = null;
			try {
				s = (String)objin.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date d = null;
			try {
				d = (Date)objin.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s + d);
			fin.close();
			objin.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
