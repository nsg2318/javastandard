package jumpToJava.chap05.Q2Q3Q4;

public class MaxLimitCalculator extends Calculator{
  void add(int a){
    super.value += a;
    if (value >= 100){
      value = 100;
    }
  }
}
