package com.hcl.dy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter your name");
          
        	  String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  System.out.println("name is " +name);
           
	}

}
