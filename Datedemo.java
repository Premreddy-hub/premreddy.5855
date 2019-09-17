package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
  /**
   * main class.
   * @param args to give the day for the date.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Date dt = new Date();
    System.out.println(dt);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println(sdf.format(dt));
    String strDate = "07/27/2019";
    try {
      Date obj = sdf.parse(strDate);
      System.out.println(obj);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
