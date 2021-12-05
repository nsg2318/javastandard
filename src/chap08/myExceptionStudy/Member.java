package chap08.myExceptionStudy;




public class Member {
    private final int a;
    private final int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Member(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int div() {
        return a/b;
    }

    @Override
    public String toString() {
        return getClass().getName()+"@ a: "+a+" b: "+b;
    }

}
