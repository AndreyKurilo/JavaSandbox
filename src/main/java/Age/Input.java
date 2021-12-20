package Age;

import java.util.Scanner;

public class Input {
  private final Scanner inputScanner;

  public Input() {
    inputScanner = new Scanner(System.in);
  }

  public String getSurname() {
    System.out.println("Enter Your surname:");
    return inputScanner.nextLine();
  }

  public String getName() {
    System.out.println("Enter Your name:");
    return inputScanner.nextLine();
  }

  public int getBirthYear() {
    int birthYear;

    while (true)
    {
      System.out.println("Enter year of birth (4 digits):");
      birthYear = inputScanner.nextInt();

      if(!Validation.IsYearValid(birthYear))
        System.out.println("Wrong number of year!");
      else
        break;
    }

    return birthYear;
  }

  public int getBirthMonth() {
    System.out.println("Enter month of birth (1 - 12):");
    int birthMonth;

    while (true)
    {
      birthMonth = inputScanner.nextInt();

      if(Validation.IsMonthValid(birthMonth) != true)
        System.out.println("Input wrong number of month!");
      else
        break;
    }

    return birthMonth;
  }

  public int getBirthDay() {
    System.out.println("Enter day of birth (1 - 31):");
    int birthDay;

    while (true)
    {
      birthDay = inputScanner.nextInt();

      if(Validation.IsDayValid(birthDay) != true)
        System.out.println("Wrong number of the day!");
      else
        break;
    }

    return birthDay;
  }
}
