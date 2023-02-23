package step01.exam06;

import java.util.Scanner;

//10430 나머지
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] input = new int[3];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        int A = input[0];
        int B = input[1];
        int C = input[2];

        System.out.println((A + B) % C);
        System.out.println(((A + C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);

        sc.close();

    }

}
