package step01.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2588번 곱셈
public class Main01 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        br.close();

        System.out.println(A * (B.charAt(2) - '0')); // 일
        System.out.println(A * (B.charAt(1) - '0')); // 십
        System.out.println(A * (B.charAt(0) - '0')); // 백
        System.out.println(A * (Integer.parseInt(B)));

    }

}

// next() vs nextLine()
// BufferedReader