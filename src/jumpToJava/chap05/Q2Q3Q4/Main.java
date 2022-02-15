package jumpToJava.chap05.Q2Q3Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    MaxLimitCalculator maxLimitCalculator = new MaxLimitCalculator();
    maxLimitCalculator.add(50);
    maxLimitCalculator.add(60);
    System.out.println(maxLimitCalculator.getValue());
    System.out.println(maxLimitCalculator.isOdd(2));

    System.out.println("==============================");

    int[] values = {1,2,3,4,5,6};
    List<Integer> valuesList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    System.out.println("avg = "+maxLimitCalculator.avg(valuesList));
  }
}
