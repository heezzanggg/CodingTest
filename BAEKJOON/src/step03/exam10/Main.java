package step03.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;

    while ((str = br.readLine()) != null) {
      int A = str.charAt(0) - 48;
      int B = str.charAt(2) - 48;

      System.out.println(A + B);
    }

  }
}
