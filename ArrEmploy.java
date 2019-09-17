package com.hcl.collections;

import java.util.List;
import java.util.ArrayList;

public class ArrEmploy {
  /**
   * main class.
   * @param args contains names ,nos and basic pay.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List listemp = new ArrayList();
    listemp.add(new Employ(1,"prem",2200.4));
    listemp.add(new Employ(2,"reddy",3200.4));
    listemp.add(new Employ(3,"ram",4200.4));
    int sum = 0;
    for (Object obj:listemp) {
      Employ e = (Employ)obj;
      System.out.println(e);
    }
  }

}
