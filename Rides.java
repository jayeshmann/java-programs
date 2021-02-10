class HeightNotSufficientException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 6395646832128961462L;
  int R_Height;

  HeightNotSufficientException(int h1) {
    R_Height = h1;
  }

  public String toString() {
    return ("Person is not eligible for ride because of height: " + R_Height);
  }
}



class AgeNotSufficientException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = -3740671758813781389L;
  int R_Age;

  AgeNotSufficientException(int a1) {
    R_Age = a1;
  }

  public String toString() {
    return ("Person is not eligible for ride because of age: " + R_Age);
  }
}


public class Rides {
  String Name;
  int Age;
  int Height;

  Rides(String n, int a, int h) {
    Name = n;
    Age = a;
    Height = h;
  }

  void BigRide() throws HeightNotSufficientException, AgeNotSufficientException {
    if (Height >= 100 && Age >= 18) {
      System.out.println("Person is eligible for big ride.");
    } else {
      if (Height < 100) {
        throw new HeightNotSufficientException(Height);
      } else {
        throw new AgeNotSufficientException(Age);
      }

    }

  }

  void SmallRide() throws HeightNotSufficientException, AgeNotSufficientException {
    if (Height >= 50 && Age >= 12) {
      System.out.println("Person is eligible for small ride.");
    } else {
      if (Height < 50) {
        throw new HeightNotSufficientException(Height);
      } else {
        throw new AgeNotSufficientException(Age);
      }

    }

  }

  public static void main(String[] args) {
    Rides e = new Rides("Ava", 12, 100);
    try {
      e.BigRide();
      e.SmallRide();
    } catch (HeightNotSufficientException | AgeNotSufficientException E) {
      System.out.println("Exception: " + E);
    }
  }

}
