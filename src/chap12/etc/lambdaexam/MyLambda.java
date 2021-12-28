package chap12.etc.lambdaexam;

public class MyLambda {
  public static void main(String[] args) {
    Myfunction myfunction = Math::max;
    int big = myfunction.max(30, 20);
    int big2 = myfunction.max(10,20);
    System.out.println(big);
    System.out.println(big2);
  }
}


interface Myfunction {
  int max(int a, int b);
}
