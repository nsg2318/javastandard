package jumpToJava.chap05.Q1;

public class Calculator {
  int value;

  public Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  int getValue() {
    return this.value;
  }
}
