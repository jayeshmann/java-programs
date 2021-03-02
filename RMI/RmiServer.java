package RMI;

import java.rmi.Naming;

public class RmiServer {
  public static void main(String[] args) {
    try {
      Adder stub = new AdderRemote();
      Naming.rebind("rmi://localhost:5000/john", stub);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

