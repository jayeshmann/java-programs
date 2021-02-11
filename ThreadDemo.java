class ThreadDemo {
  public static void main(String[] args) {
    int a = 10, b = 5;
    new MyThread(a, b, "Child1");
    new MyThread(a, b, "Child2");
    System.out.println("the diff is " + (a - b));
  }
}


class MyThread implements Runnable {


  Thread t;
  String name;
  int x, y;

  MyThread(int a1, int b1, String s) {
    t = new Thread(this, s);
    x = a1;
    y = b1;
    t.start();
  }

  @Override
  public void run() {
    if (t.getName().equals("Child1")) {
      System.out.println("the sum is " + (x + y));
    } else {
      System.out.println("the sum : " + (x + y));
    }
  }

}
