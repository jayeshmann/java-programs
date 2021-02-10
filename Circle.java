interface circleConstants {
  final double pi = 3.14;
  final double radius = 6;
  final double height = 8;
}


class Circle implements circleConstants {

  double circumference() {
    return 2 * pi * radius;
  }

  double area() {
    return pi * radius * radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println("area is " + c.area());
    System.out.println("circumference is " + c.circumference());
  }
}
