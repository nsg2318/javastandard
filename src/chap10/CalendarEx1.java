package chap10;


import java.util.Calendar;

public class CalendarEx1 {
  public static void main(String[] args) {
    Calendar today = Calendar.getInstance();
    today.set(2021,12,7);
    System.out.println(today.get(Calendar.YEAR));
    System.out.println(today.get(Calendar.MONTH));
    System.out.println(today.get(Calendar.DATE));
  }
}
