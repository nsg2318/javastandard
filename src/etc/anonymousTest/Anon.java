package etc.anonymousTest;


import java.util.Comparator;

public class Anon {
  public static void main(String[] args) {

    Student a = new Student(17,8);
    Student b = new Student(17,22);
    Student c = new Student(17,1);
    Student d = new Student(17,4);
    Student e = new Student(17,8);

    int isBig = comp2.compare(a,d);
    System.out.println(isBig);
  }

  public static Comparator<Student> comp2 = Comparator.comparingInt(o -> o.classNumber);

  public static Comparable<Student> comp3 = new Comparable<>() {
    @Override
    public int compareTo(Student o) {
      return 30;
    }
  };
}


class Student {
  int age;
  int classNumber;

  public Student(int age, int classNumber) {
    this.age = age;
    this.classNumber = classNumber;
  }
}