package chap12.etc.lambdaexam;

public class MyLambda {
  public static void main(String[] args) {
    System.out.println("메인 시작");
    LambdaClass lambdaClass = new LambdaClass();
    int c = lambdaClass.printMaxInt(10, 20);
  }
}

class LambdaClass{

  int printMaxInt(int a, int b) {
    return a > b ? a : b;
  }


}
