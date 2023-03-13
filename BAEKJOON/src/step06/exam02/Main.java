package step06.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3003 
public class Main {
  public static void main(String[] args) throws IOException {
    // 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] piece = { 1, 1, 2, 2, 2, 8 }; // 원래 체스의 피스 수
    int[] inputPiece = new int[6]; // 입력 받은 체스의 피스 수

    for (int i = 0; i < inputPiece.length; i++) {
      inputPiece[i] = Integer.parseInt(st.nextToken());
    }

    // 원래 피스 - 입력받은 피스
    for (int i = 0; i < piece.length; i++) {
      System.out.print(piece[i] - inputPiece[i] + " ");
    }
  }
}
