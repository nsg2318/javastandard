package etc.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Q3 {
  public static void main(String[] args) throws IOException {
//    File file = new File("/Users/sunba/sample.dat");
//    FileReader fileReader = new FileReader("/Users/sunba/sample.dat");
    BufferedReader reader = new BufferedReader(new FileReader("/Users/sunba/sample.dat"));
    Set<String> set = new HashSet<>();
    while(reader.readLine() != null) {
      set.add(reader.readLine());
    }
    set.remove(null);
    set.forEach(i -> System.out.println(i));
    reader.close();
  }
}
