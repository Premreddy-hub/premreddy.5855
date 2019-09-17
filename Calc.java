package com.hcl.dy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try{
		int a,b,c;
		System.out.println("enter two numbers");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 a=Integer.parseInt(br.readLine());
		 b=Integer.parseInt(br.readLine());
		 c = a + b;
		 System.out.println(c);

	} catch(NumberFormatException e) {
		e.printStackTrace();
		
	}
	}

}
