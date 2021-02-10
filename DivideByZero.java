import java.util.Scanner;

class DivideByZero {
  public static void main(String[] args) {

    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a: ");
    a = sc.nextInt();
    System.out.println("Enter b: ");
    b = sc.nextInt();
    int c = a / b;
    System.out.println(c);
    sc.close();
  }

}
