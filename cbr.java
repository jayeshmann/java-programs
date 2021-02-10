class cbr {
  int a, b;

  public cbr(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void swap(cbr obj) {
    int temp;
    temp = obj.a;
    obj.a = obj.b;
    obj.b = temp;
    System.out.println("a = " + obj.a + ", b = " + obj.b);
  }

  public static void main(String[] args) {
    cbr o = new cbr(5, 10);
    System.out.println("a = " + o.a + ", b = " + o.b);
    o.swap(o);
    System.out.println("a = " + o.a + ", b = " + o.b);
  }
}
