package chap05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem0501 {
  public static void main(String[] args) {
    System.out.println("となりのきゃくはよくきゃくくうきゃくだ。".lastIndexOf("きゃく"));

    System.out.println(String.format("%sの気温は%.2f℃です。", "千葉", 17.256));

    System.out.println("彼女の名前は花子です。".replace("彼女", "妻"));

    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")).plus(Duration.parse("P5DT6H")));

    var dt1 = LocalDate.of(2020, 3, 12);
    var dt2 = LocalDate.of(2020, 11, 5);
    var period = Period.between(dt1, dt2);
    System.out.println(period.getMonths() + "ヶ月" + period.getDays() + "日間");
  }
}
