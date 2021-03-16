import java.io.FileOutputStream;

public class TryWithResources {
  public static void main(String args[]) {


    try (FileOutputStream fos = new FileOutputStream("./abc.txt")) {
      String str = "Java new feature";
      byte b[] = str.getBytes();
      fos.write(b);
      System.out.println("String written to file!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
