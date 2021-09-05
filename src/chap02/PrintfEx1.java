package chap02;

public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_100_100L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n",b);
        System.out.printf("finger={%5d]", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n",hex);

    }
}
