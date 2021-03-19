package CodeQuest;

import java.util.Scanner;

public class Lapindrome {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String first, second;
    String str = sc.next();
    int l = str.length();
    if (l % 2 == 0) {
      first = str.substring(0, l / 2);
      second = str.substring(l / 2, l);
    } else {
      first = str.substring(0, l / 2);
      second = str.substring(l / 2 + 1, l);
    }
    StringBuffer sbuf = new StringBuffer(second);

    String s1 = new String(first);
    String s2 = new String(sbuf.reverse());

    if (s1.equals(s2))
      System.out.println(first + " = " + second);
    else
      System.out.println("not a lapindrome");
    sc.close();
  }
}
