package chap05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice0503 {
  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.now();
    System.out.println(dt.format(DateTimeFormatter.ofPattern("現在はM月のm分です。")));

    System.out.println("今日から20日後は" + dt.plusDays(20) + "です。");
  }
}
