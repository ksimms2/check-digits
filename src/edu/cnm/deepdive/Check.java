package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {


  public static int digitSum(int var) {
    String str;
    int result = 0;

    str = Integer.toString(var);
    for(int i = 0; i < str.length(); i++ ){
      result += str.charAt(i) - 48;
    }

      return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter number: ");
    int var = scanner.nextInt();
    Check.digitSum(var);
    System.out.println("Enter number: " + var);
    System.out.println("Divide input by 9: " + (var /9));
    System.out.println("Run digitSum method: " + digitSum(var));
    System.out.println("Divide digitSum method by 9: " + digitSum(var) / 9);

  }


}
