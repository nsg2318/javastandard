package chap07.inheritance;

public class Main {
  public static void main(String[] args) {
    Child child = new Child();
    child.play();
    child.play();

    System.out.println(child.age);
    String result = child.toString();
    System.out.println(result);
    Class<? extends Child> aClass = child.getClass();
    System.out.println(aClass);
  }
}
