package step04.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 10818 최소,최대
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 입력 받을 정수 갯수
    int[] arr = new int[N]; // 입력 받은 수 넣을 배열변수

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {

      arr[i] = Integer.parseInt(st.nextToken());

    }
    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();
    System.out.println(min + " " + max);

  }
}
