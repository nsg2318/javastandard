package etc.interview;



public class ByteTest {
  public static void main(String[] args) {
    byte[] a = new byte[5];
    for (int i = 0; i < a.length+1; i++) {
      a[i] = 'a';
    }

    System.out.println(a[0]);
  }

}
