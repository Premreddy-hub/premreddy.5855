package com.hcl.dy5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	DataInputStream din=
    			new DataInputStream(new FileInputStream("c:/files/data.txt"));
    	int x = din.readInt();
    	x++;
    	System.out.println("x value -" +x);
    	String name=din.readUTF();
    	System.out.println("name is "+name);
    	double base = din.readDouble();
    	System.out.println("base "+ base);
    	boolean flag = din.readBoolean();
    	System.out.println(flag);
    	din.close();
    	
    } catch(FileNotFoundException e) {
    	e.printStackTrace();
    } catch(IOException e) {
    	e.printStackTrace();
    }
	}

}
