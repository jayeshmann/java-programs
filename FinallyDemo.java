class FinallyDemo {
  private static void ProcA() {
    try {
      System.out.println("Inside ProcA");
      throw new RuntimeException("demo");
    } finally {
      System.out.println("Inside ProcA finally");
    }
  }

  private static void ProcB() {
    try {
      System.out.println("Inside ProcB");
      return;
    } finally {
      System.out.println("ProcB finally");
    }
  }

  public static void main(String[] args) {
    try {
      ProcA();

    } catch (Exception e) {
      System.out.println(e.toString());
    }
    ProcB();
  }
}
