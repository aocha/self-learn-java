package chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice0602 {
  public static void main(String[] args) {
    var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30));
    var list2 = new ArrayList<Integer>(Arrays.asList(60, 90));
    list.remove(0);
    list.set(1, 20);
    list.addAll(2, list2);
    for (var i : list) {
      System.out.println(i);
    }
  }
}
