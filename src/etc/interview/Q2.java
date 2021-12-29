package etc.interview;

import java.util.List;

public class Q2 {
  public static void main(String[] args) {
    List<String> values = List.of("1", "2", "3");
    int[] result = stringArrayToIntArray(values);
    printArray(result);
    values = List.of("a","2","ab","3");
    result = stringArrayToIntArray(values);
    printArray(result);

  }

  private static void printArray(int[] result) {
    for (int j : result) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  private static int[] stringArrayToIntArray(List<String> values) {
    int[] result = values.stream().filter(value -> isNumeric(value)).mapToInt((value) -> Integer.parseInt(value)).toArray();
    return result;
  }

  private static boolean isNumeric(String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
