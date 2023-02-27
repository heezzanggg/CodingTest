package step03.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//25304 영수증
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int total = Integer.parseInt(br.readLine()); // 영수증 총 금액
    int n = Integer.parseInt(br.readLine());// 구매한 갯수
    int result = 0; // 내가 계산한 총 금액

    for (int i = 0; i < n; i++) {
      String[] arrStr = br.readLine().split(" ");
      int a = Integer.parseInt(arrStr[0]); // 각 물건의 가격
      int b = Integer.parseInt(arrStr[1]); // 각 물건의 갯수
      result += (a * b);
    }
    br.close();

    if (result == total) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    // System.out.println(total == result ? "Yes" : "No");

  }
}
