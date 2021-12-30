package chap13;

public class ThreadEx4 {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("-"));
    }
    System.out.print("소요기간1: "+(System.currentTimeMillis()-startTime));
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("|"));
    }
    System.out.print("소요기간2: "+(System.currentTimeMillis()-startTime));
  }
}
