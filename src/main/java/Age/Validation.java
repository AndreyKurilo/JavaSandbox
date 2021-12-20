package Age;

import java.util.Calendar;

public class Validation {

  public static Boolean IsYearValid(int year) {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return (year > 0 && year <= currentYear);
  }

  public static boolean IsMonthValid(int birthMonth) {
    return birthMonth > 0 && birthMonth <= 12;
  }

  public static boolean IsDayValid(int birthDay) {
    return birthDay > 0 && birthDay <= 31;
  }
}
