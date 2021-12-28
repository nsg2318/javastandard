package chap14;


@FunctionalInterface
interface MyFunction {
  void run(); // public abstract void run();
}

public class LambdaEx1 {
  static void execute(MyFunction f) {
    f.run();
  }

  static MyFunction getMyFunction() {
    MyFunction f = () -> System.out.println("f3.run()");
    return f;
  }

  public static void main(String[] args) {
    //람다식으로 MyFunction의 run()을 구현
    MyFunction f1 = () -> System.out.println("f1.run()");
    MyFunction f2 = new MyFunction() {
      @Override
      public void run() {
        System.out.println("f2.run()");
      }
    };
    MyFunction f3 = getMyFunction();

    //MyFunction 인터페이스의 run 추상메서드를 각각의 방법으로 구현한 f1,f2,f3의 run 메서드를 각각 호출
    f1.run();
    f2.run();
    f3.run();

    //execute는 MyFunction 인터페이스를 파라미터로 받으므로, 해당 메서드의 파라미터는 람다로 구현된 참조변수를 넘겨야한다 (f1,f2,f3 중 하나) 또는 젤 마지막 라인과 같이 직접 안에다가 구현할수도 있다.
    execute(f1);
    execute(() -> System.out.println("run()"));
  }
}
