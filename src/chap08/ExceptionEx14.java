package chap08;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method2();
        }
        catch (IllegalArgumentException ea){
            System.out.println("illegalArgumnet 터짐");
            ea.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("main 에서 처리됨 thorws 해서");
            e.printStackTrace();
        }

        try {
            method3();
        }
        catch (Exception e) {
            System.out.println("여기까지 올라나");
            e.printStackTrace();
        }
    }

    static void method2() throws Exception {
        throw new IllegalArgumentException();
    }
    static void method3() throws Exception {
        throw new Exception();
    }
}
