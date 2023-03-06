package step04.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10810 공넣기
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken(" ")); // 바구니 갯수
    int M = Integer.parseInt(st.nextToken(" ")); // 공 넣을 횟수
    int[] baskets = new int[N]; // 바구니를 배열로 만듦.

    for (int a = 0; a < M; a++) { // 공 넣는 횟수
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      while (i - 1 <= j - 1) { // N번째 바구니까지 숫자 넣을 반복분
        baskets[i - 1] = k;
        i++;
      }
    }

    for (int a = 0; a < N; a++) {
      System.out.print(baskets[a] + " ");
    }
  }
}
