package step04.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//2562 최대값
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
      arr.add(i, Integer.parseInt(br.readLine()));
    }

    int max = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {
      if (max < arr.get(i)) {
        max = arr.get(i);
      }
    }

    System.out.println(max);
    System.out.println(arr.indexOf(max) + 1);

  }
}
