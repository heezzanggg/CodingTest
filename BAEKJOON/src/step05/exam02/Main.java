package step05.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2743  단어길이재기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println(str.length());
  }
}
