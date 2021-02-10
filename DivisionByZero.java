import java.util.Scanner;

class DivisionByZero {
  public static void main(String[] args) {
    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter a: ");
      a = sc.nextInt();
      System.out.println("Enter b: ");
      b = sc.nextInt();
      int c = a / b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println("Handled Exception is: " + e);
    }
    System.out.println("Program still continues...");
    sc.close();
  }
}
