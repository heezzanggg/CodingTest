package step05.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10809 알파벳찾기
public class Main {
  public static void main(String[] args) throws IOException {
    String S = "abcdefghijklmnopqrstuvwxyz";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    for (int i = 0; i < S.length(); i++) {
      String element = String.valueOf(S.charAt(i));
      if (str.contains(element)) {
        System.out.print(str.indexOf(element) + " ");
      } else {
        System.out.print("-1" + " ");
      }
    }

  }
}
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
