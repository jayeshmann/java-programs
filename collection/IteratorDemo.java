package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    ArrayList<String> as = new ArrayList<String>();
    as.add("John");
    as.add("Mary");
    as.add("Kelly");

    for (String i : as) {
      System.out.println(i);
    }

    Iterator<String> itr = as.iterator();

    System.out.println(itr.next());

  }
}
