package chap12;


class Fruit {
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit {
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {
  public String toString() {
    return "Grape";
  }
}

class Toy {
  public String toString() {
    return "Toy";
  }
}

public class FruitBoxEx1 {
  public static void main(String[] args) {
    Box<Fruit> fruitBox = new Box<Fruit>();
    Box<Apple> appleBox = new Box<Apple>();
    Box<Toy> toyBox = new Box<Toy>();
//    Box<Grape> grapeBox = new Box<Apple>();

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
  }
}
