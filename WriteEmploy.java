package com.hcl.dy5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		try{
			FileOutputStream fout =
					new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout=
					new ObjectOutputStream(fout);
			Employ e=new Employ (1,"prem reddy",33485.6);
			objout.writeObject(e);
			objout.close();
			fout.close();
			System.out.println("Employ details Stored");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
