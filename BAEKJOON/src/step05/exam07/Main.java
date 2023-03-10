package step05.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1152 단어의갯수
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    System.out.println(st.countTokens());

    // 이방법은 중간 공백2개이상일경우 카운팅해버려서 단어 갯수만 카운팅이 안되유~
    // String str = br.readLine().trim();
    // System.out.println(str.split(" ").length);
  }
}
