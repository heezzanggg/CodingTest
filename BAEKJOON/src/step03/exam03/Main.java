package step03.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8393   합
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int sum = 0;
    int j = 1;
    br.close();

    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println(sum);

    // while (j <= num) {
    // sum += j;
    // j++;
    // }
    // System.out.println(sum);
  }
}
