import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "hellojava";

    String num = sc.nextLine();
    int newNum = Integer.parseInt(num);

    // String[] arrStr = str.split("");

    // for (int i = 0; i < arrStr.length; i++) {
    // if (i + 1 == newNum) {
    // arrStr[i] = arrStr[i].toUpperCase();
    // }
    // System.out.print(arrStr[i] + "");
    // }

    String strAnswer = "";
    for (int i = 0; i < str.length(); i++) {
      if (newNum == i + 1) {
        String.valueOf(str.charAt(newNum - 1)).toUpperCase();
      }
      strAnswer += str;

    }
    System.out.println(strAnswer);

  }
}
