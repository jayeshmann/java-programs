import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

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
      BufferedReader buf = new BufferedReader(new InputStreamReader(s.getInputStream()));
      String name = buf.readLine();
      ps.println("Hello " + name + "!");
      ss.close();
    }
  }
}
