package step01.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2588번 곱셈
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        System.out.println(A * (B % 10)); // 일
        System.out.println(A * (B % 100 / 10)); // 십
        System.out.println(A * (B / 100)); // 백
        System.out.println(A * B);

    }

}

// next() vs nextLine()
// BufferedReader