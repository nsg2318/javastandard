package etc.exceptionTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExceptionTest {
  public static void main(String[] args) {
    int a = 1;
    String line = "a:b:c";
    String[] str = line.split(":");
    System.out.println(str[0]);
    System.out.println(str[1]);
    System.out.println(str[2]);
    String now = LocalDate.now().toString();
    System.out.println(now+"나우");


    System.out.println(str);

    System.out.println("=====시작=====");

    if(a == 1){
      fail.failHandler(a);
    }

    System.out.println("여기 타는지가 중요222222");

  }
}

class fail{
  static void failHandler(int a){
    try {
      System.out.println("TryStart");
      int b;
      b = a/0;
      System.out.println("TryEnd");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      throw new ArithmeticException("아리쓰메틱이빈다");
    }
    finally {
      System.out.println("finally");
    }
    System.out.println("여기 탔는지가 중요");
  }
}
