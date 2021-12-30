package chap12.ex2;


interface Eatable {
}

class FruitEx2 implements Eatable {
  public String toString() {
    return "Fruit";
  }
}

class AppleEx2 extends FruitEx2 {
  @Override
  public String toString() {
    return "Apple";
  }
}

class GrapeEx2 extends FruitEx2 {
  @Override
  public String toString() {
    return "Grape";
  }
}

class ToyEx2 {
  @Override
  public String toString() {
    return "Toy";
  }
}

public class FruitBoxEx2 {
  public static void main(String[] args) {
  }
}
