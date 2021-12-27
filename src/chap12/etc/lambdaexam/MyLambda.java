package chap12.etc.lambdaexam;

public class MyLambda {
  public static void main(String[] args) {
    Object f = new Object(){
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };
  }
}
