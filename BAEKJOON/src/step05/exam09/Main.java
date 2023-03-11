package step05.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5622 다이얼
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split("");

    method1(str);
    method2(str);

  }

  private static void method1(String[] str) {

    String[][] arrStr = { {}, {}, { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" }, { "J", "K", "L" },
        { "M", "N", "O" }, { "P", "Q", "R", "S" }, { "T", "U", "V" }, { "W", "X", "Y", "Z" }, {} };

    int time = 0;
    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < arrStr.length; j++) {
        for (int k = 0; k < arrStr[j].length; k++) {
          if (str[i].equals(arrStr[j][k])) {
            time += j;
          }
        }
      }
    }
    System.out.println(time + str.length);
  }

  private static void method2(String[] str) {

    int result = 0;
    int num = 0;

    for (int i = 0; i < str.length; i++) {
      // System.out.println(str[i]);
      switch (str[i]) {
        case "A":
        case "B":
        case "C":
          num = 2;
          break;
        case "E":
        case "F":
        case "D":
          num = 3;
          break;

        case "H":
        case "I":
        case "G":
          num = 4;
          break;

        case "J":
        case "K":
        case "L":
          num = 5;
          break;

        case "M":
        case "N":
        case "O":
          num = 6;
          break;

        case "P":
        case "Q":
        case "R":
        case "S":
          num = 7;
          break;

        case "T":
        case "U":
        case "V":
          num = 8;
          break;

        case "W":
        case "X":
        case "Y":
        case "Z":
          num = 9;
          break;
      }
      result += num;
    }
    System.out.println(result + str.length);

  }
}
