package step04.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken(" "));// 바구니 갯수 M
    int M = Integer.parseInt(st.nextToken(" "));// 바구니 바꿀 횟수

    // 바구니 List로 만들어서 순서대로 번호 지정하기
    List<Integer> basket = new ArrayList<>();

    for (int i = 0; i <= (N + 1); i++) {
      basket.add(i);
    }

    System.out.println("바구니 번호");
    for (int i = 0; i < N + 1; i++) {
      System.out.print(basket.get(i) + " ");
    }

    System.out.println("\n" + "=================");

    // 바구니 순서 M번 바꾸기
    for (int a = 0; a < M; a++) {
      // i,j 받기
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int element = j;
      // 바구니 순서 i~j까지 역순으로
      for (int b = i; b <= j; b++) {

        System.out.println("바꿀 자리: " + b);
        System.out.println("들어갈 값: " + basket.get(element));
        basket.set(b, basket.get(element));
        element--;

      }
    }

    System.out.println();
    for (int i = 1; i < N + 1; i++) {
      System.out.print(basket.get(i) + " ");
    }

  }
}
