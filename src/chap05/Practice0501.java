package chap05;

public class Practice0501 {
  public static void main(String[] args) {
    String str = "プログラミング言語";
    System.out.println(str.substring(4, 7));

    String str2 = "鈴木\t太郎\t男\t50歳\t鹿児島";
    System.out.println(String.join("&", str2.split("\t")));
  }
}
