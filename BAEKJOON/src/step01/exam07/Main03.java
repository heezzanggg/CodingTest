package step01.exam07;

import java.util.Scanner;

//2588번 곱셈
public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int b1 = b % 10; // 일의자리
        int b10 = b % 100 / 10; // 십의자리
        int b100 = b / 100; // 백의자리

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);

    }

}

// next() vs nextLine() : https://seeminglyjs.tistory.com/256 참조!
// BufferedReader