class ThreadComparison {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    new MyThreadComparison(s1, s2, "Child1");
    new MyThreadComparison(s1, s2, "Child2");
    System.out.println("compareTo: " + (s1.compareTo(s2)));

  }
}


class MyThreadComparison implements Runnable {

  Thread t;
  String str1, str2, name;

  MyThreadComparison(String s1, String s2, String name) {
    t = new Thread(this, name);
    str1 = s1;
    str2 = s2;
    t.start();
  }

  @Override
  public void run() {
    if (t.getName().equals("Child1")) {
      System.out.println("equals: " + (str1.equals(str2)));
    } else {
      System.out.println("==: " + (str1 == str2));
    }
  }
}
