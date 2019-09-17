package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortcomparable {
	public static void main(String[] args) {
		
	 
		// TODO Auto-generated method stub
		SortedSet s = new TreeSet();
		s.add(new Emp(1,"zema",3511438));
		s.add(new Emp(2,"lilu",3511370));
		s.add(new Emp(3,"aadireddy",3511563));
		System.out.println("Sorted data");
		s.forEach(System.out::println);
	}

}
