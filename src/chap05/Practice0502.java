package chap05;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Practice0502 {
  public static void main(String[] args) {
    String str = "住所は〒160-0000 新宿区南町0-0-0です。\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね";
    Pattern ptn = Pattern.compile("\\d{3}-\\d{4}");
    Matcher match = ptn.matcher(str);
    while (match.find()) {
      System.out.println(match.group());
    }

    String str1 = "お問い合わせはsupport@example.comまで";
    System.out.println(str1.replaceAll(
      "[a-z_0-9]+([-+.][a-z_0-9]+)*@[a-z_0-9]+([-+.][a-z_0-9]+)*.[a-z_0-9]+([-+.][a-z_0-9]+)*",
      "<a href=\"mailto:$0\">$0</a>"
    ));
  }
}
