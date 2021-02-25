import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {
  public static void main(String[] args) throws IOException {
    Socket cs;


    cs = new Socket("127.0.0.1", 900);
    InputStream in = cs.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String s = br.readLine();
    System.out.println(s);
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String st = buf.readLine();
    System.out.println(st);

    cs.close();
  }
}
