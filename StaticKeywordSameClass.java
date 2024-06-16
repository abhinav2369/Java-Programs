import java.lang.*;

public class StaticKeywordSameClass{
  
  // Static Method
  public static void StaticMethod(){
    System.out.println("Static Method");
  }

  // Non Static Method
  public void NonStaticMethod(){
    System.out.println("Non Static Method");
  }

  // Main Method
  public static void main(String[] args){
    
    // Calling of Static method within same class
    StaticMethod();

    // creating instance of MyClass in same class in main function
    StaticKeywordSameClass new_instance = new StaticKeywordSameClass();
    new_instance.NonStaticMethod();
  }
  
}
