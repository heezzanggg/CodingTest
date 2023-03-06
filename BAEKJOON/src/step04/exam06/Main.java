package step04.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10813 공바꾸기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken(" "));// 바구니 갯수 N
    int M = Integer.parseInt(st.nextToken(" "));// 공 바꿀 횟수
    int[] baskets = new int[N];

    // 초기 바구니에 들어있는 공 번호
    for (int i = 0; i < N; i++) {
      baskets[i] = i + 1;
    }

    // 공 바꾸기
    for (int k = 0; k < M; k++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken(" "));
      int j = Integer.parseInt(st.nextToken(" "));
      int numI = baskets[i - 1];
      int numJ = baskets[j - 1];
      baskets[i - 1] = numJ;
      baskets[j - 1] = numI;
    }

    // 각 바구니의 공 출력
    for (int i = 0; i < N; i++) {
      System.out.print(baskets[i] + " ");
    }

  }
}
