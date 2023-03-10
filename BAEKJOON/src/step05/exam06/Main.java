package step05.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2675 문자열 반복
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

    for (int i = 0; i < T; i++) {
      String str = br.readLine();
      int R = Integer.parseInt(str.substring(0, 1)); // 반복횟수 3
      String S = str.substring(2); // 입력받을 문자 ABC
      String result = "";

      for (int j = 0; j < S.length(); j++) {
        for (int k = 0; k < R; k++) {
          result += S.charAt(j);
        }
      }
      System.out.println(result);// AAABBBCCC
    }
  }
}
