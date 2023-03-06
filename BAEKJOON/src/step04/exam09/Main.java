package step04.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10811  바구니 뒤집기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken(" ")); // N개 바구니
    int M = Integer.parseInt(st.nextToken(" ")); // 바꿀횟수 M

    // 바구니 번호 설정 [1]=1번바구니
    int[] basket = new int[N + 1];
    for (int i = 1; i < basket.length; i++) {
      basket[i] = i;
    }

    // 바구니 역순으로 바꾸기
    for (int a = 0; a < M; a++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken(" ")); // 바꿀 바구니 start
      int j = Integer.parseInt(st.nextToken(" ")); // 바꿀 바구니 end
      int copoyJ = j;
      int copyB = i;

      while (copoyJ >= i) {

        basket[copyB] = copoyJ;
        copyB++;
        copoyJ--;

      }

      // for (int b = i; b <= (j - i + 1); b++) {
      // basket[b] = num;
      // num--;
      // }

      for (int c = 1; c < basket.length; c++) {
        System.out.print(basket[c] + " ");
      }
      System.out.println();
    }

    // for (int i = 1; i < basket.length; i++) {
    // System.out.print(basket[i] + " ");
    // }
  }
}
