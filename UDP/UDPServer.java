package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    String str = "Java is old.";
    InetAddress ip = InetAddress.getByName("127.0.0.1");
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 4000);
    ds.send(dp);
    ds.close();
  }
}
