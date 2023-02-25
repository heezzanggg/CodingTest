package step02.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2884 알람시계
public class Main {
  public static void main(String[] args) throws IOException {
    // H M :설정한 알람시간
    // -45분 적용한 알람시간 설정하기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] time = br.readLine().split(" "); // 입력받은것 스플릿해서 배열에 담기
    br.close();

    int H = Integer.parseInt(time[0]); // 시
    int M = Integer.parseInt(time[1]); // 분

    // if (M >= 45) {
    // M -= 45;
    // } else {
    // M += 15;
    // if (H == 0) {
    // H = 23;
    // } else {
    // H -= 1;
    // }
    // }

    // System.out.println(H + " " + M);

    System.out.println(M >= 45 ? H + " " + (M - 45) : H == 0 ? 23 + " " + (M + 15) : (H - 1) + " " + (M + 15));
    // 삼항 연산 사용시 코드의 길이가 짧아질뿐
    // 결과값 도출까지의 시간은 똑같이 나왔음

  }
}