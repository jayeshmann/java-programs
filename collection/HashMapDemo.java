package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
  public static void main(String[] args) {

    System.out.println();
    System.out.println();
    HashMap<String, Integer> map = new HashMap<>();
    map.put("a", 10);
    map.put("b", 30);
    map.put("c", 20);

    System.out.println("Size before:" + map.size());
    System.out.println(map);
    map.remove("c");
    System.out.println("Size after:" + map.size());
    System.out.println();
    System.out.println();

    for (Entry<String, Integer> e : map.entrySet())
      System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

    System.out.println();
    System.out.println();

    if (map.containsKey("b")) {
      System.out.println("Key is present! Value is:" + map.get("b"));
    }
    System.out.println();
    System.out.println();

    System.out.println("All keys:" + map.keySet());
    System.out.println("All values:" + map.values());

  }
}

