package step04.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Integer> set = new HashSet<>();// 나머지 넣을 배열

    // 숫자 입력 받아서 42로 나눈 나머지 값 set에 넣기
    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(br.readLine());
      set.add(num % 42);
    }
    System.out.println(set.size());

  }
}
