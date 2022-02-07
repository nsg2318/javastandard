package chap12.etc.blogTest;


import java.util.Collection;
import java.util.Comparator;

public class BlogClass<E> {
  void printCollection(Collection<? extends E> c) {
    for (E e : c) {
      System.out.println(e);
    }
  }
}
