public class Methods {
 
  static void myMethod() {
    System.out.println("Hello World!");
    int abinav = 5;
    System.out.println(abinav);
  }
  
   static void myMethod(int abinav, boolean testing) {
    if(testing){
    	System.out.println("Hello World!");
   		System.out.println(abinav);
    }
     
  }
  

  public static void main(String[] args) {

    System.out.println("We are beginning!");
    
    myMethod();
   
   	myMethod();
    
    myMethod(100, true);
    

    
  }

}
