package step02.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//14681 사분면 
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int result;

    br.close();

    if (x > 0) {
      if (y > 0) {
        result = 1;
      } else {
        result = 4;
      }
    } else {
      if (y > 0) {
        result = 2;
      } else {
        result = 3;
      }
    }
    System.out.println(result);
  }
}