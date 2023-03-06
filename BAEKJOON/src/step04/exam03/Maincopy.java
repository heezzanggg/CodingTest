package step04.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 10818
public class Maincopy {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] arrNum = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arrNum.length; i++) {
      arrNum[i] = Integer.parseInt(st.nextToken(" "));
    }

    // for 문 이용해서 최대, 최소 구하기

    // int max = arrNum[0];
    // int min = arrNum[0];

    // for (int i = 0; i < arrNum.length; i++) {
    // if (max < arrNum[i]) {
    // max = arrNum[i];
    // }
    // if (min > arrNum[i]) {
    // min = arrNum[i];
    // }
    // }

    // array 클래스 이용해서 최대, 최소 구하기
    Arrays.sort(arrNum);

    int min = arrNum[0];
    int max = arrNum[arrNum.length - 1];

    System.out.println(min + " " + max);

  }
}
