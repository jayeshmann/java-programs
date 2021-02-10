interface stack1 {
  void push(char item);

  char pop();
}


class StackC implements stack1 {
  private char[] stk;
  private int tos;

  StackC(int size) {
    stk = new char[size];
    tos = -1;
  }

  public void push(char item) {
    if (tos == stk.length - 1) {
      System.out.println("Stack Overflows");
      char t[] = new char[stk.length * 2];
      for (int i = 0; i < stk.length; i++)
        t[i] = stk[i];
      stk = t;
      stk[++tos] = item;
    } else
      stk[++tos] = item;
  }

  public char pop() {
    if (tos < 0) {
      System.out.println("Stack Underflows");
      return '0';
    } else
      return stk[tos--];
  }
}


interface stack2 {
  void push(String item);

  String pop();
}


class StackS implements stack2 {
  private String[] stk;
  private int tos;

  StackS(int size) {
    stk = new String[size];
    tos = -1;
  }

  public void push(String item) {
    if (tos == stk.length - 1) {
      System.out.println("Stack Overflows");
      String t[] = new String[stk.length * 2];
      for (int i = 0; i < stk.length; i++)
        t[i] = stk[i];
      stk = t;
      stk[++tos] = item;
    } else
      stk[++tos] = item;
  }

  public String pop() {
    if (tos < 0) {
      System.out.println("Stack Underflows");
      return "0";
    } else
      return stk[tos--];
  }
}


class Run2 {
  public static void main(String[] args) {
    stack1 charInf;
    stack2 stringInf;
    StackC chSTK = new StackC(3);
    StackS stringSTK = new StackS(3);
    charInf = chSTK;
    for (int i = 0; i < 3; i++)
      charInf.push('A');
    System.out.println("Char Stack Contents using interface reference: ");

    for (int i = 0; i < 3; i++)
      System.out.println(charInf.pop());

    stringInf = stringSTK;
    for (int i = 0; i < 3; i++)
      stringInf.push("I don't like Java anymore");
    System.out.println("String Stack Contents using interface reference: ");

    for (int i = 0; i < 3; i++)
      System.out.println(stringInf.pop());

  }
}
