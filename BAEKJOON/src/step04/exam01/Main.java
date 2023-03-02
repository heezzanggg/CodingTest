package step04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 10807
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());// ㅣ입력받을 수 의 갯수
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < arr.length; i++) { // 입력받은 숫자로 배열 만들기
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int cnt = 0;
    int searchNum = Integer.parseInt(br.readLine()); // 찾고싶은 숫자

    for (int i = 0; i < arr.length; i++) { // 배열 항목 돌면서 찾고싶은 숫자 카운트 올리기
      if (searchNum == arr[i]) {
        cnt++;
      }
    }
    System.out.println(cnt);
    br.close();
  }

}
