package step03.exam06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());// 테스트 케이스
    int result = 0;

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      result = a + b;
      bw.write(result + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}

// StringTokenizer 클래스
// :문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스. 그렇게 쪼개어진 문자열 토큰(token).
// buffer(버퍼) : 데이터를 한곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역. 입출력 속도
// 향상을 위해 버퍼 사용
// BufferedReader : 버퍼를 이용한 입력
// BufferedWriter : 버퍼를 이용한 출력
// buffer flush : 버퍼에 남아있는 데이터를 출력시킴(버퍼 비우는 동작)
