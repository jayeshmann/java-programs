package RMI;

import java.rmi.Naming;

public class RmiClient {
  public static void main(String[] args) {
    try {
      Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/john");
      System.out.println(stub.add(34, 4));
    } catch (Exception e) {
    }

  }
}
