package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {


  public static int digitSum(int var) {
    String str; // creates local string variable
    int result = 0; // creates local int variable
    int noNeg = Math.abs(var); // converts neg input to positive
    str = Integer.toString(noNeg); // assigns parameter Integer to String method
    for(int i = 0; i < str.length(); i++ ){ // iterates over the local string variable
      result += str.charAt(i) - 48;
    }

      return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter number: ");
    int var = scanner.nextInt();
    int noNeg = Math.abs(var); // takes absolute value and makes all digits positive
    Check.digitSum(noNeg);
    System.out.println("A little positivity makes a new number: " + noNeg);
    System.out.println("Divide by 9 to get a remainder of " + (noNeg  % 9));
    System.out.println("Run digitSum method: " + digitSum(noNeg));
    System.out.println("Divide digitSum by 9 to get a remainder of " + digitSum(noNeg) % 9);

  }


}
