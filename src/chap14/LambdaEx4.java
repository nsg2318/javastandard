package chap14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class LambdaEx4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    UnaryOperator<Integer> t = ab -> ab * 10;
    list.forEach(a -> System.out.print(a + ","));
    System.out.println();
    list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
    System.out.println(list);
    list.replaceAll(ab -> ab * 10);
    list.replaceAll(new UnaryOperator<Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return integer * 20;
      }
    });
    list.replaceAll(t);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");
    map.forEach((k, v) -> System.out.println(k + " " + v));
  }
}
