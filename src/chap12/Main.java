package chap12;


public class Main {
  private static final long MAX_SPEED = 100L;

  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.setItem("ㅅ");
    int a = 5;
    int b = 'B';
    char c = 65;
    int x = 5;
    int[] score = new int[5];


    System.out.println(score);
    System.out.println(x = x++ - ++x);
    System.out.println(x);
    System.out.println(box.getItem());
    System.out.println(box);
    System.out.println(MAX_SPEED);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

  }

}
