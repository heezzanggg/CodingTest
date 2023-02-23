package step01.exam05;

import java.util.Scanner;

//3003 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = { 1, 1, 2, 2, 2, 8 };
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
            System.out.println(c[i] + " ");
        }

        sc.close();

    }

}
