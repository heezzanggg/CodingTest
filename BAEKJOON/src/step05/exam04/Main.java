package step05.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11720 숫자의 합
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int sum = 0;
    String str = br.readLine();
    String[] arrStr = str.split("");
    for (int i = 0; i < num; i++) {
      sum += Integer.parseInt(arrStr[i]);
    }
    System.out.println(sum);
  }
}
