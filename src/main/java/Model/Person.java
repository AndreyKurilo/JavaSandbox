package Model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person implements Cloneable{
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

  public void showBirthDate () {
    Calendar birthDate = new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth);
    Date date = birthDate.getTime();
    System.out.println(name + " " + surname);
    System.out.println("Date of birth " + date);
  }

  public void printAge() {
    Calendar rightNow = Calendar.getInstance();
    Calendar age = (Calendar) rightNow.clone();
    age.add(Calendar.YEAR, - yearOfBirth);
    age.add(Calendar.MONTH, - monthOfBirth);
    age.add(Calendar.DAY_OF_MONTH, - dayOfBirth);
    Date ageCount = age.getTime();
    System.out.println();
    System.out.println("Age: " + (ageCount.getYear() + 1900) + " years " + ageCount.getMonth() + " months "
            + ageCount.getDate() + " days");
  }

  public Person clone() throws CloneNotSupportedException{
    return (Person) super.clone();
  }


}
