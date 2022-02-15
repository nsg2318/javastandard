package jumpToJava.chap05.Q2Q3Q4;

import java.util.List;

public class Calculator {
  int value;

  Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  int getValue() {
    return this.value;
  }


  //Q3
  boolean isOdd(int val) {
    return val % 2 != 0;
  }

  //Q4
  int avg(int[] values){
    int sum =0;
    for (int a : values){
      sum += a;
    }
    return Math.round(sum/values.length);
  }

  int avg(List<Integer> values) {
    int sum = 0;
    for(Integer a : values){
      sum += a;
    }
    return Math.round(sum/values.size());
  }
}