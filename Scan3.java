package com.hcl.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
  /**
   * main class.
   * @param args uo.
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      FileWriter fw = new FileWriter("c:/files/data.txt");
      fw.write("12 ram 23 .54. 56 true  prem" + "false 42. 34. 5 aadil reddy");
      fw.close();
      FileReader fr = new FileReader("c:/files/data.txt");
      Scanner sc = new Scanner(fr);
      while (sc.hasNext()) {
        if (sc.hasNextInt()) {
          System.out.println(sc.nextInt());
        } else {
          sc.next();
        }
      }
      sc.close();
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

	}


