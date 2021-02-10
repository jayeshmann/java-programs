public interface mc {
  int dollarToHome(int dollar);

  int homeToDollar(int home);
}


class India implements mc {
  public int dollarToHome(int dollar) {
    return dollar * 73;
  }

  public int homeToDollar(int rupee) {
    return rupee / 73;
  }
}


class Pakistan implements mc {
  public int dollarToHome(int dollar) {
    return dollar * 160;
  }

  public int homeToDollar(int rupia) {
    return rupia / 160;
  }
}


class Run {
  public static void main(String[] args) {
    mc mc1;
    India inr = new India();
    mc1 = inr;
    System.out.println("INR to USD: " + mc1.dollarToHome(1));
    Pakistan pkr = new Pakistan();
    mc1 = pkr;
    System.out.println("PKR to USD: " + mc1.dollarToHome(1));
  }
}
