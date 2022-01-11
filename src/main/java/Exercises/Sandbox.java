package Exercises;

import java.util.Scanner;

public class Sandbox {

  public void action(int number) {
    System.out.println("a in action = " + number);
    int b = number >> 1;
    System.out.println("Сдвиг на 1 разряд 2ки a >> 1 in action = " + b);
  }

  public static void main(String[] args) {
    Sandbox obj = new Sandbox();
    final Scanner scanInt;
    scanInt = new Scanner(System.in);
    System.out.println("Enter even number");
    int a = scanInt.nextInt();
    obj.action(a);

    System.out.println("from main a = " + a);
    int c = 3;
    int b = a << c;

    System.out.println("Сдвиг (умножение) на "  + c + " разряда 2ки a << " + c + " in main = " + b);
  }
}
