package chap02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력해 주세요");
        int inputValue = scanner.nextInt();
        System.out.println(inputValue);

        System.out.println("한글 입력해주세요");
        int inputString = scanner.nextInt();
        System.out.println(inputString);

    }
}
