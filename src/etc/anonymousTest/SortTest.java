package etc.anonymousTest;

import java.util.Arrays;

public class SortTest {
  public static void main(String[] args) {
    MyInteger[] arr = new MyInteger[20];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new MyInteger(Math.random()*100);
    }

    System.out.print("정렬 전 : ");
    for(MyInteger i : arr){
      System.out.print(i.value+" ");
    }
    System.out.println();
    Arrays.sort(arr);

    System.out.print("정렬 후 : ");
    for(MyInteger i : arr){
      System.out.print(i.value+ " ");
    }

  }
}

class MyInteger implements Comparable<MyInteger>{
  int value;

  public MyInteger(double value) {
    this.value = (int)value;
  }

  @Override
  public int compareTo(MyInteger o) {
    return  o.value - this.value;
  }
}
