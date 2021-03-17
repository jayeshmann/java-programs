package Collection;

import java.util.LinkedList;

class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Double> ll = new LinkedList<Double>();

    ll.addFirst(0.0);
    ll.addFirst(3.14);

    System.out.println(ll);

    System.out.println(ll.removeFirst());

    System.out.println(ll);
  }
}
