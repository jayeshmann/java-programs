import java.io.FileInputStream;
import java.io.IOException;

class Fis {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("./Alphabet.txt");
    /*
     * Scanner in = new Scanner(fis); String s1 = in.nextLine(); System.out.print(s1); in.close();
     */
    int noOfBytes = fis.available();
    System.out.println("noOfBytes: " + noOfBytes);
    byte b[] = new byte[5];
    fis.read(b);
    for (int i = 0; i < 5; i++) {
      System.out.println((char) b[i]);
    }
    System.out.println("noOfBytes: " + fis.available());

    fis.close();
  }
}
