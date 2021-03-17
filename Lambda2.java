interface Addition {
  int add(int a, int b, int c);
}


public class Lambda2 {
  public static void main(String[] args) {


    Addition add = (a, b, c) -> (a + b + c);
    System.out.println(add.add(1000, 200, 50));

  }
}
