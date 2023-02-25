package step02.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2525 오븐시계
public class Main {
  public static void main(String[] args) throws IOException {
    // 오븐구이가 끝나는 시간은?
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] startTime = br.readLine().split(" ");// 요리시작시간
    int cookTime = Integer.parseInt(br.readLine()); // 조리시간

    br.close();

    int H = Integer.parseInt(startTime[0]); // 시
    int M = Integer.parseInt(startTime[1]); // 분

    M += cookTime;

    if (M >= 60) {
      H += M / 60;
      M = M % 60;
      if (H >= 24) {
        H -= 24;
      }
    }

    System.out.println(H + " " + M);

  }
}