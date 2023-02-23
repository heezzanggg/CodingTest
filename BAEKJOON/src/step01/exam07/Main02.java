package step01.exam07;

import java.util.Scanner;

//2588번 곱셈
public class Main02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        sc.close();

        System.out.println((b.charAt(2) - '0') * a); // 일
        System.out.println((b.charAt(1) - '0') * a); // 십
        System.out.println((b.charAt(0) - '0') * a); // 백
        System.out.println(Integer.parseInt(b) * a);

    }

}

// next() vs nextLine()
// BufferedReader