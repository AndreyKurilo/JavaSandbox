package Exercises;

import java.util.Scanner;

//Number's digits sum using array
public class DigitsSum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите число целое положительное число от 0 до 2147483647");
    String str = scan.nextLine();
    char[] arrayOfStrChars = str.toCharArray();
    double amount = 0;
    try {
      for (int i = 0; i < arrayOfStrChars.length; i++){
        System.out.println("Adding " + ( i + 1) + "st/d" + " digit of number " + str);
        int digit = Integer.parseInt(String.valueOf(arrayOfStrChars[i]));
        amount = amount + digit;
        System.out.println();
        System.out.println(amount);
      }
    } catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }

  }
}
