package chap06;

import java.util.HashMap;

public class Problem0602 {
  public static void main(String[] args) {
    var map = new HashMap<String, String>() {
      {
        put("cucumber", "キュウリ");
        put("lettuce", "レタス");
        put("spinach", "ホウレンソウ");
      }
    };

    map.put("carrot", "ニンジン");
    map.remove("spinach");
    map.replace("cucumber", "胡瓜");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}
