package step04.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5597 과제안내신분
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 학생 명부
    int[] studentsList = new int[10];

    int count = studentsList.length; // 사람수 (변수화)

    for (int i = 0; i < count; i++) {
      studentsList[i] = i + 1;
    }

    // 제출 한 학생 제거
    for (int i = 0; i < count; i++) {
      int studentsNum = Integer.parseInt(br.readLine());
      if (studentsNum == studentsList[i]) {
        for (int j = i; j < count - 1; j++) {
          studentsList[j] = studentsList[j + 1];
        } // 삭제 의미
        count--;
        break;
      }
    }

    // for (int i = 0; i < studentsList.length; i++) {
    // System.out.print(studentsList[i] + " ");
    // }

  }
}
