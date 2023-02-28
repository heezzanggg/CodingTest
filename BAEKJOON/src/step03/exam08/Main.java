package step03.exam08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//11022번
public class Main {
  public static void main(String[] args) throws IOException {
    /* 내가 푼 방법! */
    /*
     * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     * 
     * int T = Integer.parseInt(br.readLine());
     * int c = 0;
     * 
     * for (int i = 1; i <= T; i++) {
     * StringTokenizer st = new StringTokenizer(br.readLine());
     * int a = Integer.parseInt(st.nextToken());
     * int b = Integer.parseInt(st.nextToken());
     * c = a + b;
     * bw.write("Case #" + i + ": " + a + " + " + b + " = " + c + "\n");
     * 
     * }
     * br.close();
     * bw.flush();
     * bw.close();
     */

    /* 다른 풀이 */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine()); // 테스트 케이스

    for (int i = 1; i <= T; i++) {
      String str = br.readLine();
      int A = str.charAt(0) - 48;
      int B = str.charAt(2) - 48;
      sb.append("Case #").append(i).append(": ")
          .append(A).append(" + ").append(B).append(" = ")
          .append(A + B).append("\n");
    }
    System.out.println(sb);
  }
}

// charAt() :String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌