package step03.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//25314 코딩은 체육과목입니다.
public class Main {
  // int 앞에 long을 하나씩 더 붙일 때마다 4바이트씩 저장할 수 있는 공간이 늘어나는 걸까
  // long int => 4바이트
  // long long int => 8바이트
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()); // 바이트크기
    br.close();

    // StringBuilder & for 사용
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n / 4; i++) {
      sb.append("long ");
    }

    System.out.println(sb + "int");

    // repeat메서드 사용
    // System.out.println("long ".repeat(n / 4) + "int");

  }
}
