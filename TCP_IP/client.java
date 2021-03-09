package TCP_IP;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
  public static void main(String[] args) throws IOException {
    Socket cs;
    cs = new Socket("127.0.0.1", 900);

    Scanner br = new Scanner(cs.getInputStream());
    String s = br.nextLine();
    System.out.println(s);

    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    PrintStream pStream = new PrintStream(cs.getOutputStream());
    pStream.println(name);

    System.out.println(br.nextLine());

    cs.close();
    sc.close();
  }
}
