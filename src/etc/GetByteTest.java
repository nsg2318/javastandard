package etc;


public class GetByteTest {
  private final String b = "aa";

  public static void main(String[] args) {
    final String a = "abcdefg";
    byte[] bytes = a.getBytes();
    System.out.println(bytes);


  }
}
