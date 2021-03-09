package TCP_IP;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

  public static void main(String[] args) throws IOException {
    while (true) {
      int port = 900;
      Socket s;
      ServerSocket ss = new ServerSocket(port);
      s = ss.accept();
      System.out.println("Server running on port: " + port);

      PrintStream ps = new PrintStream(s.getOutputStream());
      ps.println("Enter name: ");

      Scanner sc = new Scanner(s.getInputStream());
      String name = sc.nextLine();
      ps.println("Hello " + name + "!");

      ss.close();
    }
  }
}
