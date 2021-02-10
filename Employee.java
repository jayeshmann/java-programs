class Employee {
  int age;
  String name, address;

  public Employee() {
    this.name = "Jay";
    this.age = 21;
    this.address = "India";

  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Employee obj = new Employee();
    System.out.println("Name before  :  " + obj.getName());
    System.out.println("Age before  :  " + obj.getAge());
    System.out.println("Address  :  " + obj.getAddress());
    System.out.println("-----------------------------------------");
    obj.setName("cat");
    obj.setAge(23);
    System.out.println("Name after  :  " + obj.getName());
    System.out.println("Age After  :  " + obj.getAge());
    System.out.println("Designation  :  " + obj.getAddress());
  }
}
