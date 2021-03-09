package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket(4000);
    byte b[] = new byte[1024];
    DatagramPacket dp = new DatagramPacket(b, b.length);
    ds.receive(dp);
    String s1 = new String(dp.getData(), 0, dp.getLength());
    System.out.println("Received: " + s1);
    ds.close();
  }
}
