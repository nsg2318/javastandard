package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

    stack.push("0");
    stack.push("1");
    stack.push("2");

    queue.offer("3");
    queue.offer("4");
    queue.offer("5");

    //없애진 않음 다음 애 반환할 뿐
    for (int i = 0; i < 1; i++) {
      System.out.println(stack.peek());
    }

    //꺼냄(없앰)
    System.out.println("=== Stack ===");
    while(!stack.empty()){
      System.out.println(stack.pop());
    }

    //없애진 않음 다음 애 반환할 뿐
    System.out.println("=== Queue element ===");
    for (int i = 0; i < 2; i++) {
      System.out.println(queue.element());
    }

    // poll 과 remove의 차이는 비어있으면 익셉션이냐 null이냐 차이
    System.out.println("=== Queue ===");
    while(!queue.isEmpty()){
      System.out.println(queue.poll());
    }
  }
}
