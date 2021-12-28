package chap14;

import java.util.ArrayList;

public class LambdaEx4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    list.forEach(a -> System.out.println(a+","));

  }
}
