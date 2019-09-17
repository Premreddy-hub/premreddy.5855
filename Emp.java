package com.hcl.collections;

public class Emp implements Comparable {
  int empno;
  String name;
  double basic;
  /**
   * program to declare employ details.
   * @param empno int.
   * @param name String.
   * @param basic double. 
   */

  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }

  @Override
  public int compareTo(Object arg0) {
    // TODO Auto-generated method stub
    Emp e = (Emp)arg0;
    return name.compareTo(e.name);
  }



}
