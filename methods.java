public class Methods {

  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static String b()
  {
    return "Banana";
  }

  static void myMethod(int hello, boolean test) {
    if(test){
    System.out.println(hello + ". " + "Hi!");
    }
  }

  public static void main(String[] args) {
    myMethod();

    myMethod(5000, true);
    myMethod(4000, true);
    myMethod(3000, true);
    myMethod(2000, true);
    myMethod(1000, true);

    myMethod(0, true);

    myMethod();

    String variable = b();
    System.out.println(variable);


  }

}
