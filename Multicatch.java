import java.util.*;

public class Multicatch {
  public static void main(String[] args) {
    int a = 5, b;
    Scanner s = new Scanner(System.in);
    try {
      System.out.println("Enter number:");
      b = s.nextInt();
      int c = a / b;
      int x[] = {1, 2, 3};
      System.out.println("c is " + c);
      System.out.println(x[5]);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException caught: " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
    } catch (Exception e) {
      System.out.println("Exception caught: " + e);
    }
    s.close();
  }
}
