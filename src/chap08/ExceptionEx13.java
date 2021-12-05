package chap08;


public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception 발생하였음");
            e.printStackTrace();
        }
    }
}

