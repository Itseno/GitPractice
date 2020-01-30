public class Methods {
 
  static void myMethod() {
    System.out.println("Hello World!");
  }
  
  static void myMethod(int hello, boolean test) {
    if(test){
    System.out.println(hello + ". " + "Hi!");
    }
  }

  public static void main(String[] args) {
    myMethod();
    
    myMethod(15, true);
    
  }

}
