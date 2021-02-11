public class ThreadClassDemo {
  public static void main(String[] args) {
    String a = "hello", b = "hello";
    String s1 = "Child1";
    String s2 = "Child2";
    new MyThreadClass(a, b, s1);
    new MyThreadClass(a, b, s2);
    System.out.println("I'm the main process.");
    System.out.println("compareTo: " + (a.compareTo(b)));
  }
}


class MyThreadClass extends Thread {
  String x, y;

  MyThreadClass(String a1, String b1, String s) {
    super(s);
    x = a1;
    y = b1;
    start();
  }

  @Override
  public void run() {
    super.run();
    if (Thread.currentThread().getName().equals("Child1"))
      System.out.println("equals: " + (x.equals(y)));
    else
      System.out.println("==: " + (x == y));
  }
}
