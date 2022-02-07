package chap12.etc.myCompare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car{
  int weight;

  public Car(int weight) {
    this.weight = weight;
  }

}

class Suv extends Car{
  int dieselWater;
  public Suv(int weight,int dieselWater) {
    super(weight);
    this.dieselWater = dieselWater;
  }

  public Suv(int weight){
    super(weight);
    this.dieselWater = 1000;
  }

}

class SuvComp implements Comparator<Car> {
  @Override
  public int compare(Car o1, Car o2) {
    return o1.weight - o2.weight;
  }
}

public class CompareExample {
  public static void main(String[] args) {
    Suv suv = new Suv(1000);
    Suv suv1 = new Suv(1010,300);
    Suv suv2 = new Suv(800,600);
    Suv suv3 = new Suv(250,400);
    List<Suv> suvList = new ArrayList<>();
    suvList.add(suv);
    suvList.add(suv1);
    suvList.add(suv2);
    suvList.add(suv3);
    Collections.sort(suvList,new SuvComp());
    for (int i = 0; i < suvList.size(); i++) {
      System.out.println(suvList.get(i).dieselWater);
    }


  }
}
