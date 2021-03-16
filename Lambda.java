
interface SayHello {
  public String say(String name);
}


public class Lambda {
  public static void main(String[] args) {

    String str = "Hello, ";

    SayHello s1 = (name) -> {
      return str + name;
    };
    System.out.println(s1.say("jay"));

  }
}
