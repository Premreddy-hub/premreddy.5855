package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortemp {
  /**
  * main class.
  * @param args to compare between the names.
  */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Comparator c = new BasicComparator();
    SortedSet ss = new TreeSet (c);
    ss.add(new Employ(1,"prem",9200.4));
    ss.add(new Employ(2,"zayn",1200.4));
    ss.add(new Employ(3,"aadil",4200.4));
    System.out.println("Sorted data");
    ss.forEach(System.out::println);

  }

}
