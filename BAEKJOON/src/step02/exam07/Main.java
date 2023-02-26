package step02.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2480 주사위 세개
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arrStr = br.readLine().split(" ");

    br.close();

    int a = Integer.parseInt(arrStr[0]);
    int b = Integer.parseInt(arrStr[1]);
    int c = Integer.parseInt(arrStr[2]);

    int money = 0; // 상금

    if (a == b && a == c) {
      // 세수 같을 경우 10000+주사위 숫자*1000
      money = 10000 + a * 1000;
    } else if (a == b || a == c || b == c) {
      // 두수 같을 경우
      if (a == b || a == c) {
        money = 1000 + a * 100;
      } else if (b == c) {
        money = 1000 + b * 100;
      }
    } else {
      // 세수 다를 경우
      int max = a;
      if (b > max) {
        max = b;
      }
      if (c > max) {
        max = c;
      }
      money = max * 100;
    }

    System.out.println(money);

  }
}