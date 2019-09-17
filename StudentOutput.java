package com.hcl.dy5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentOutput {

	public StudentOutput(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Student st = new Student(115 , "Prem" ,87.5);
			System.out.println("Student file created");
			objout.writeObject(st);
			objout.close();
			fout.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
