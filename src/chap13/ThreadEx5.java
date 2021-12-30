package chap13;

public class ThreadEx5 {
  static long startTime =0;

  public static void main(String[] args) {
    ThreadEx5_1 threadEx5_1 = new ThreadEx5_1();
    threadEx5_1.start();
    startTime = System.currentTimeMillis();

    for (int i = 0; i < 300; i++) {
      System.out.printf("%s",new String("-"));
    }
    System.out.print("소요기간1: "+(System.currentTimeMillis()- ThreadEx5.startTime));
  }
}

class ThreadEx5_1 extends Thread {
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s",new String("|"));
    }
    System.out.print("소요기간2: "+(System.currentTimeMillis()- ThreadEx5.startTime));
  }
}
