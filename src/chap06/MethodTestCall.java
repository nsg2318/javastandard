package chap06;

public class MethodTestCall {

  public static void callTest() {
    System.out.println("callTest");
    MethodTestCall methodTestCall = new MethodTestCall();
    methodTestCall.callTest2();
  }

  public void callTest2() {
    System.out.println("callTest2");
    callTest3();
  }

  public void callTest3() {
    System.out.println("callTest3");
  }

}
