package step05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//11654 아스키코드
public class Main {
  public static void main(String[] args) throws IOException {
    // Scanner sc = new Scanner(System.in);
    // char ch = sc.nextLine().charAt(0);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char ch = br.readLine().charAt(0);

    int num = (int) ch;
    System.out.println(num);
  }
}
