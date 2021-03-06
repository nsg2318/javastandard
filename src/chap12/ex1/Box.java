package chap12.ex1;

import java.util.ArrayList;

public class Box<T> {
  T item;
  ArrayList<T> list = new ArrayList<T>();
  void add(T item){
      list.add(item);
  }

  T get(int i) {
      return list.get(i);
  }

  ArrayList<T> getList() {
      return list;
  }

  int size() {
      return list.size();
  }

  public String toString() {
      return list.toString();
  }
}
