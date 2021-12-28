package chap14;

public class LambdaEx2 {
  public static void main(String[] args) {
    MyFunction function = () -> {}; // Myfunction f = (MyFunction) (() -> {});
    Object obj = (MyFunction) (() -> {});
    String str = ((Object) (MyFunction) (() -> {})).toString();
    System.out.println(function);
    System.out.println(obj);
    System.out.println(str);

//    System.out.println(()->{});
    System.out.println((MyFunction)(()->{}));
    System.out.println(((Object)(MyFunction)(()->{})).toString());
  }
}
