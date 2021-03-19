import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {
  public static void main(String args[]) throws FileNotFoundException {

    FileOutputStream fos = new FileOutputStream("./abc.txt");

    try (fos) {
      String str = "Java new feature";
      byte b[] = str.getBytes();
      fos.write(b);
      System.out.println("String written to file!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
