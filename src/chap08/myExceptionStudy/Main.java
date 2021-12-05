package chap08.myExceptionStudy;

public class Main {
    public static void main(String[] args) {
        Member member = new Member(1,0);

        try { member.div(); } catch (ArithmeticException e) {
            System.out.println("존나 어렵네");
        }
        finally {
            System.out.println(member);
        }

    }
}
