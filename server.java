import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

  public static void main(String[] args) throws IOException {
    int port = 900;
    Socket s;
    ServerSocket ss = new ServerSocket(port);
    s = ss.accept();
    System.out.println("Server running on port: " + port);
    PrintStream ps = new PrintStream(s.getOutputStream());
    ps.println("Enter name: ");

    ss.close();
  }
}
