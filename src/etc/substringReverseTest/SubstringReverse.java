package etc.substringReverseTest;


import java.text.DecimalFormat;

public class SubstringReverse {
  public static void main(String[] args) {
    String businessNumber = "1234567890";
    String businessNumberReverse = businessNumber.substring(0,3)+"-"+businessNumber.substring(3,5)+"-"+businessNumber.substring(5);
    System.out.println(businessNumberReverse);

    String targetNumber = "0";
    targetNumber = targetNumber.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
    System.out.println(targetNumber);
  }
}
