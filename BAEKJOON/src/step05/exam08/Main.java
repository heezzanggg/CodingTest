package step05.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2908 상수
public class Main {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {

    // method1();
    // method2();
    method3();

  }

  public static void method1() throws IOException {
    String[] str = br.readLine().split(" ");

    String[] str1 = str[0].split("");
    String[] str2 = str[1].split("");

    int num1 = (Integer.parseInt(str1[2])) * 100 + (Integer.parseInt(str1[1])) * 10 + Integer.parseInt(str1[0]);
    int num2 = (Integer.parseInt(str2[2])) * 100 + (Integer.parseInt(str2[1])) * 10 + Integer.parseInt(str2[0]);

    if (num1 > num2) {
      System.out.println(num1);
    } else {
      System.out.println(num2);
    }
  }

  public static void method2() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());

    int newNum1 = (num1 / 100) + (num1 / 10 % 10) * 10 + (num1 % 10) * 100;
    int newNum2 = (num2 / 100) + (num2 / 10 % 10) * 10 + (num2 % 10) * 100;

    if (newNum1 > newNum2) {
      System.out.println(newNum1);
    } else {
      System.out.println(newNum2);
    }
  }

  public static void method3() throws NumberFormatException, IOException {
    String[] str = br.readLine().split(" ");
    int num1 = Integer.parseInt(str[0]);
    int num2 = Integer.parseInt(str[1]);

    int result1 = 0;
    int result2 = 0;

    while (num1 != 0) {
      result1 = result1 * 10 + num1 % 10;
      num1 /= 10;
      System.out.println("==================");
      System.out.println(result1);
      System.out.println(num1);
    }
    while (num2 != 0) {
      result2 = result2 * 10 + num2 % 10;
      num2 /= 10;
    }

    if (result1 > result2) {
      System.out.println(result1);
    } else {
      System.out.println(result2);
    }

  }
}
