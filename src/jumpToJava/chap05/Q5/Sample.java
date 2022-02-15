package jumpToJava.chap05.Q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> b = a;
    a.add(4);
    System.out.println(a);
    System.out.println(b);
    System.out.println(b.size());
  }
}
