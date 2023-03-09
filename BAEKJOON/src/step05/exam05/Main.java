package step05.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10809 알파벳찾기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
    // "l", "m", "n", "o", "p", "q", "r", "s",
    // "t", "u", "v", "w", "x", "y", "z" };
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    String S = br.readLine(); // baekjoon

    for (int i = 0; i < alphabet.length(); i++) {
      if (S.equals(alphabet.equals(S))) {
        System.out.println(alphabet.indexOf(alphabet));
      } else {
        System.out.println("-1");
      }
    }

  }
}
