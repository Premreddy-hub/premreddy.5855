package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scanfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin = new FileInputStream("C:/Users/Coalesce/workspace/Day 4/src/com/hcl/ex/Custom.java");
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
