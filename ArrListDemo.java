package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
  /**
   * creation of an array list.
   * @param args name is added to the list.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List list = new ArrayList();
    list.add("prem");
    list.add("paul");
    list.add("shawn");
    list.add("sriram");
    list.add("vishnu");
    System.out.println("names are :-");
    //for(Object object:list){
    //System.out.println(object);
    System.out.println("JDK 1.8");
    list.forEach(System.out::println);
    list.set(0,"Prem Reddy");
    System.out.println("\n " + "After update");
    list.forEach(System.out::println);
    list.remove(4);
    System.out.println("\n" + "after second updation");
    list.forEach(System.out::println);
    list.add(4,"john");
    System.out.println("\n");
    list.forEach(System.out::println);
  }
}
