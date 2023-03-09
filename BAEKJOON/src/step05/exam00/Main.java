package step05.exam00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//27866 문자와 문자열
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int i = Integer.parseInt(br.readLine());
    System.out.println(str.substring(i - 1, i));
  }
}
