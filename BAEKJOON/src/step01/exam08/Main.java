package step01.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11382 꼬마정민
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        br.close();

        String[] arrStr = str.split(" ");
        // 공백을 기준으로 배열에 담아서
        // 각 배열하나씩 꺼내서 더하면 될까????

        long a = Long.parseLong(arrStr[0]);
        long b = Long.parseLong(arrStr[1]);
        long c = Long.parseLong(arrStr[2]);

        System.out.println(a + b + c);

    }

}
