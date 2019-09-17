package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet();
		s.add("vinod");
		s.add("prem");
		s.add("reddy");
		s.add("raghu");
		s.add("ram");
		s.add("sai");
		System.out.println("Sorted data");
		s.forEach(System.out::println);

	}

}
