package step05.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9086 문자열
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 테스트케이스

    for (int i = 0; i < T; i++) {
      String str = br.readLine();
      String[] arrStr = str.split("");
      System.out.println(arrStr[0] + arrStr[arrStr.length - 1]);
    }

  }

}
