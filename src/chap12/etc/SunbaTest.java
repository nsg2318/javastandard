package chap12.etc;

import java.util.ArrayList;

public class SunbaTest {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("ㅁ");
    arrayList.add(1);
    arrayList.add(new Member("sunba"));


    for (Object o : arrayList) {
      System.out.println(o);
    }
  }
}

class Member{
  String name;
  public Member(String name){
    this.name = name;
  }
}

