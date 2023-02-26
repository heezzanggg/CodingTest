package step03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2739 구구단
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    br.close();

    for (int i = 1; i < 10; i++) {
      System.out.println(num + " * " + i + " = " + num * i);

      // int result = num * i;
      // System.out.printf("%d * %d = %d %n", num, i, result);
    }
  }
}