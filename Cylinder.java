class Cylinder implements circleConstants {

  double area() {
    return (2 * pi * radius * height) + (2 * pi * radius * radius);
  }

  double volume() {
    return pi * radius * radius * height;
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    Cylinder c1 = new Cylinder();
    System.out.println("area is " + c.area());
    System.out.println("circumference is " + c.circumference());
    System.out.println("area of cylinder is " + c1.area());
    System.out.println("volume of cylinder is " + c1.volume());
  }

}
