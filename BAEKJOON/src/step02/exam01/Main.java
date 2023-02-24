package step02.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1330  두수 비교하기
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    br.close();

    String[] arrStr = str.split(" ");

    int num1 = Integer.parseInt(arrStr[0]);
    int num2 = Integer.parseInt(arrStr[1]);

    if (num1 > num2) {
      System.out.println(">");
    } else if (num1 < num2) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }

  }

}
