package step04.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 10871
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    int[] A = new int[N];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < A.length; i++) {
      A[i] = Integer.parseInt(st.nextToken());

      if (X > A[i]) {
        System.out.print(A[i] + " ");
      }
    }
  }
}
