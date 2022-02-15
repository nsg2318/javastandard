package jumpToJava.chap05.Q1;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.add(10);
    System.out.println(calculator.getValue());


    UpgradeCalculator upgradeCalculator = new UpgradeCalculator();
    upgradeCalculator.add(5);
    System.out.println(upgradeCalculator.getValue());
    upgradeCalculator.minus(3);
    System.out.println(upgradeCalculator.getValue());


  }
}
