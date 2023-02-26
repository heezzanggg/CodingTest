package step03.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10950 A+B-3
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    for (int i = 0; i < num; i++) {
      String[] arrStr = br.readLine().split(" ");
      int a = Integer.parseInt(arrStr[0]);
      int b = Integer.parseInt(arrStr[1]);
      System.out.println(a + b);
    }

    br.close();
  }
}
