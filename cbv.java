class cbv {
  int a, b;

  public cbv() {
    this.a = 0;
    this.b = 0;
  }

  public cbv(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("a = " + a + ", b = " + b);
  }

  public static void main(String[] args) {
    int a = 5, b = 10;
    cbv o = new cbv(a, b);
    System.out.println("a = " + o.a + ", b = " + o.b);
    o.swap(a, b);
    System.out.println("a = " + o.a + ", b = " + o.b);
  }
}
