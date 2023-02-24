package step02.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2753번 윤년
public class Main {
  // 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
  // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inYear = Integer.parseInt(br.readLine());

    br.close();

    // if (inYear % 4 == 0 && (inYear % 100 != 0 || inYear % 400 == 0)) {
    // System.out.println(1);
    // } else {
    // System.out.println(0);
    // }

    boolean yearleap = (inYear % 4 == 0 && (inYear % 100 != 0 || inYear % 400 == 0));
    System.out.println(yearleap == true ? "1" : "0");
  }
}
