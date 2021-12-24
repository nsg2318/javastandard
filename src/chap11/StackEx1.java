package chap11;

import java.util.Stack;

public class StackEx1 {
  public static Stack back = new Stack();
  public static Stack forward = new Stack();


  public static void main(String[] args) {

    Integer a = 25;
    Integer b = 22;

    goURL("1.네이트");
    goURL("2.야후");
    goURL("3.네이버");
    goURL("4.다음");
    goURL("5.카카오");

    int c = a.compareTo(b);
    System.out.println("===================");
    System.out.println(c);
    System.out.println("===================");
    int d = Integer.compare(a, b);

    printStatus();


  }

  private static void printStatus() {
    System.out.println("back:" + back);
    System.out.println("forward" + forward);
    System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");
    System.out.println();
  }

  public static void goURL(String url) {
    back.push(url);
    if (!forward.empty())
      forward.clear();
  }
}
