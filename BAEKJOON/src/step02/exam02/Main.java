package step02.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9498 시험성적
public class Main {
  // 시험 점수를 입력받아
  // 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을
  // 작성하시오.

  // BufferedReader 사용하여 숫자 입력 받을 경우,
  // readLine() 사용하여 String을 int로 바꿔주는 작업을 하면 됩니당!!!
  // 참고!!!! https://snupi.tistory.com/48

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int score = Integer.parseInt(br.readLine());
    char grade;

    br.close();

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println(grade);
  }

}
