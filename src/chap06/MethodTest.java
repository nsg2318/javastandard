package chap06;

public class MethodTest {

  public static void main(String[] args) {
    printMethod();
  }

  public static void printMethod2() {
    System.out.println("테스트 2");
  }

  private static void printMethod() {
    System.out.println("테스트");

    printMethod2();
    MethodTestCall.callTest();
  }


}
