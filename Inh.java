class Animal {
  String color = "white";

  void printColor() {
    System.out.println(color);
  }
}


class Dog extends Animal {
  String color = "black";

  void printColor() {
    super.printColor();
    System.out.println(color);
  }
}


public class Inh {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.printColor();
  }
}

