package step01.exam07;

import java.util.Scanner;

public class nextAndnextInt {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("next======================================================");
    // 우선 next의 경우 공백문자를 받아들일 수가 없다.
    String str1 = sc.next(); // a a
    System.out.println("str1 -> " + str1); // str1 -> a

    System.out.println("nextLine======================================================");
    sc.nextLine();

    String str2 = sc.nextLine(); // a a
    System.out.println("str2 -> " + str2); // str2 -> a a
    // nextLine의 경우, 공백문자가 포함된 문자열을 입력값으로 주었음에도 불구하고 모두 저장하여 출력되는 것을 확인할 수 있다.

    System.out.println("next vs nextLine======================================================");

    String str3 = sc.next();// a a
    System.out.println("str3 -> " + str3); // str3 -> a
    String str4 = sc.nextLine();
    System.out.println("str4 -> " + str4); // str4 -> a

    sc.close();

  }

}
