package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
  /**
   * main class of array list.
   * @param args takes numbers.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List num = new ArrayList();
    num.add(new Integer(12));
    num.add(new Integer(14));
    num.add(new Integer(16));
    num.add(new Integer(18));
    num.add(new Integer(20));
    int sum = 0;
    for (Object ob:num) {
      sum = sum + (Integer)ob;
    }
    System.out.println(sum);  
  }

}
