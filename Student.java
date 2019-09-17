package com.hcl.dy5;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
     
	int sno;
	String name;
	double cgp;
	
	public Student(int sno,String name,double cgp) {
		this.name = name;
		this.sno = sno;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
	}
	
}
