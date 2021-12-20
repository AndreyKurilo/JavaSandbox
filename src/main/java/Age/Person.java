package Age;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person implements Cloneable {
  private String name;
  private String surname;
  private int dayOfBirth;
  private int monthOfBirth;
  private int yearOfBirth;

  public Person(String name, String surname, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
    this.name = name;
    this.surname = surname;
    this.dayOfBirth = dayOfBirth;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
  }

  public void printAge() {
    Calendar rightNow = Calendar.getInstance();
    Calendar age = (Calendar) rightNow.clone();
    age.add(Calendar.YEAR, - yearOfBirth);
    age.add(Calendar.MONTH, - monthOfBirth + 1);
    age.add(Calendar.DAY_OF_MONTH, - dayOfBirth);
    int year = age.get(Calendar.YEAR);
    int month = age.get(Calendar.MONTH);
    int days = age.get(Calendar.DAY_OF_MONTH);
    System.out.println();
    System.out.println("Age: " + year + " years " + month + " months " + days + " days");
  }

  public Person clone() throws CloneNotSupportedException{
    return (Person) super.clone();
  }
}
