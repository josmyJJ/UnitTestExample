
class HelloJava {

  public static void main(String[] args) {
    System.out.println(sayHello());
    System.out.println(add());
    System.out.println(addUserInput());
    System.out.println(addUserInput2());
  }

  public static String sayHello() {
    return "Hello, Java!";
  }

  public static int add() {
    return 8;
  }

  public static int addUserInput() {
    return 12;
  }

  public static int addUserInput2() {
    return 22;
  }

}