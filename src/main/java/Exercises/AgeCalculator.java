package Exercises;

import Model.Person;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
  public static void main(String[] args) {
    Calendar rightNow = Calendar.getInstance();
    Date dateNow = rightNow.getTime();
    System.out.println();
    System.out.println(dateNow);
    System.out.println();
    final Scanner scan = new Scanner(System.in);
    String name = getName(scan);
    String surname = scan.nextLine();
    System.out.println("Enter year of birth (4 digits):");
    int year = scan.nextInt();
    while (year > 0 && year < dateNow.getYear()){
      System.out.println("Wrong number of year!");
      System.out.println("Enter year of birth (4 digits):");
      year = scan.nextInt();
    }
    int month;
    do {
    System.out.println("Enter mounth of birth (1 - 12):");
    month = scan.nextInt() - 1;
    if (month < 0 && month > 11)
      System.out.println("Input wrong number of month!");
    }
    while (month < 0 && month >= 12);

    int day;
    do {
      System.out.println("Enter day of birth (1 - 31):");
      day = scan.nextInt();
      if (day < 0 && day > 31)
        System.out.println("Wrong number of the day!");
    }
    while (day < 1 && day > 31);

    Person person = new Person(name, surname, year, month, day);

    person.showBirthDate();
    person.printAge();
  }

  private static String getName(Scanner scan) {
    String name = getString(scan);
    System.out.println("Enter Your surname:");
    return name;
  }

  private static String getString(Scanner scan) {
    System.out.println("Enter Your name:");
    return scan.nextLine();
  }


}
