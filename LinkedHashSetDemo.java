package com.hcl.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
  /**
   * main class.
   * @param args takes names.
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Set s=new LinkedHashSet();
    s.add("vinod");
    s.add("prem");
    s.add("reddy");
    s.add("vinod");
    s.add("prem");
    s.add("reddy");
    System.out.println("hash set data");
    s.forEach(System.out::println);
  }

}
