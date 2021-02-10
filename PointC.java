class PointC {
  int x, y;

  PointC() {
    this.x = 0;
    this.y = 0;
  }

  PointC(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void display() {
    System.out.println("x = " + this.x + " and y = " + this.y);
  }

  public static void main(String[] args) {
    {
      PointC p1 = new PointC();
      PointC p2 = new PointC(5, 10);
      p1.display();
      p2.display();
      System.out.println("p1 x = " + p2.getX());
    }
  }
}
