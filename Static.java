class Static {
  String name;
  String address;
  static int rate = 3;
  int deposit;

  Static() {
    name = "sbi";
    address = "janakpuri";
  }

  Static(int a) {
    deposit = a;
  }

  int getInterest() {
    int amt = (deposit * rate) / 100 + deposit;
    return amt;
  }

  public static void main(String[] args) {
    Static bb = new Static(5000);
    // bb = new Static(5000);
    System.out.println("total money: " + bb.getInterest());
  }
}

