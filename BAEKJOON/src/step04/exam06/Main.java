package step04.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//5597 과제안내신분
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 학생 명부
    Set<Integer> students = new HashSet<>();

    // 학생 명부에 1~30까지 넣기
    for (int i = 1; i <= 30; i++) {
      students.add(i);
    }

    // 입력받은 값 삭제하기 (제출한 학생 삭제)
    for (int i = 1; i <= 28; i++) {
      int num = Integer.parseInt(br.readLine());
      students.remove(num);
    }

    // 제출하지 않은 학생 출력
    for (int element : students) {
      System.out.println(element);
    }

  }
}
