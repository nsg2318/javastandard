package jumpToJava.chap05.Q7;

interface Medal {
  int addValue();
}

class Gold implements Medal {
  @Override
  public int addValue() {
    return 100;
  }
}

class Silver implements Medal {
  @Override
  public int addValue() {
    return 90;
  }
}

class Bronze implements Medal {
  @Override
  public int addValue() {
    return 80;
  }
}

class MineralCalculator {
  int value = 0;


  public void add(Medal medal){
    this.value += medal.addValue();
  }

  public int getValue() {
    return this.value;
  }
}

public class Sample {
  public static void main(String[] args) {
    MineralCalculator cal = new MineralCalculator();
    cal.add(new Gold());
    cal.add(new Silver());
    cal.add(new Bronze());
    System.out.println(cal.getValue());  // 270 출력
  }
}