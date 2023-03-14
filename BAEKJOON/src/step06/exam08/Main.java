package step06.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2941 크로아티아 알파벳
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // String[] croatiaStr = { "č", "ć", "dž", "đ", "lj", "nj", "š", "ž" };
    // String[] c_alphabet = { "c=", "c-", "dz=", ",d-", "lj", "nj", "s=", "z=" };

    String str = br.readLine();
    br.close();

    int count = 0;

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);

      if (ch == 'c') {
        if (i < str.length() - 1) {
          if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
            i++;
          }
        }
      } else if (ch == 'd') {
        if (i < str.length() - 1) {
          if (str.charAt(i + 1) == '-') {
            i++;
          } else if (str.charAt(i + 1) == 'z') {
            if (i < str.length() - 2) {
              if (str.charAt(i + 2) == '=') {
                i += 2;
              }
            }
          }

        }
      } else if (ch == 'l' || ch == 'n') {
        if (i < str.length() - 1) {
          if (str.charAt(i + 1) == 'j') {
            i++;
          }
        }
      } else if (ch == 's' || ch == 'z') {
        if (i < str.length() - 1) {
          if (str.charAt(i + 1) == '=') {
            i++;
          }

        }
      }
      count += 1;
    }
    System.out.println(count);
  }

}

// StringIndexOutOfBoundsException