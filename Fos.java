import java.io.FileOutputStream;
import java.io.IOException;

class Fos {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos1 = new FileOutputStream("./aa.txt", true); // append mode
    String s1 = "I love Java Classes.";
    String s2 = "We do lots of hands-on exercises.";
    byte b1[] = s1.getBytes();
    byte b3[] = s2.getBytes();
    fos1.write(b1);
    fos1.write(b3);
    fos1.close();

  }
}
