public class StringTest {
  public static void main(String[] args) {
    int value = 199;
    String myStr = "       Hello World!        ";
    String myStr2 = "Thanks to you";
    System.out.println(myStr);
    System.out.println(myStr.trim());
    System.out.println(myStr.toUpperCase());
    System.out.println(myStr.toLowerCase());
    System.out.println(myStr2.substring(7, 10));
    System.out.println(myStr.replace('H', 'B'));
    System.out.println(myStr.isEmpty());
    System.out.println(String.valueOf(value));
    String[] arr = myStr2.split("\\s");
    System.out.println(arr[0]);

  }
}

