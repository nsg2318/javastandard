package chap13;

public class ThreadEx1 {
  public static void main(String[] args) {
    ThreadEx1_1 t1 = new ThreadEx1_1();
    ThreadEx1_2 r = new ThreadEx1_2();
    ThreadEx1_1 t3 = new ThreadEx1_1();
    Thread t2 = new Thread(r);
    t1.start();
    t2.start();
    t3.start();
  }
}

class ThreadEx1_1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(getName()); // Thread 의 getName
    }
  }
}
class ThreadEx1_2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
