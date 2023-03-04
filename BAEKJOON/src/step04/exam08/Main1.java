package step04.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main1 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken(" "));// 바구니 갯수 M
    int M = Integer.parseInt(st.nextToken(" "));// 바구니 바꿀 횟수

    // 바구니 List로 만들어서 순서대로 번호 지정하기
    List<Integer> basket = new ArrayList<>();
    List<Integer> basketClone = new ArrayList<>();
    for (int i = 0; i <= (N + 1); i++) {
      basket.add(i);
    }

    System.out.println("바구니 번호");
    for (int i = 0; i < (N + 1); i++) {
      System.out.print(basket.get(i) + " ");
    }
    System.out.println("============");
    System.out.println();

    // for문 이용해서 바구니 순서 M번 바꾸기
    for (int a = 0; a < M; a++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      // basketClone = new int[j - i + 2]; // 순서 바꿀 배열 사이즈 지정
      int num = j;
      for (int b = 1; b < j + 1; b++) {
        basketClone.add(i, basket.get(num));
        // basketClone[b] = basket.get(num); =>basketCone이 그냥 배열일땡
        num--;
      }
    }

    // 원래 배열에 순서 바뀐거 넣기
    basket.addAll(1, basket);

    for (int i = 1; i < M; i++) {
      System.out.print(basket.get(i) + " ");
    }
  }
}
