package com.hcl.collections;

public class Employ {
  int empno;
  String name;
  double basic;
  /**
   * main class.
   * @param empno integer.
   * @param name string.
   * @param basic double.
   */
   
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}




