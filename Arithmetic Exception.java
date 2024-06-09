public class MyClass{
  public static void main(String[] args){
    int a = 10;
    int b = 0;
    
    try{
      int c = a/b;
      System.out.print(c);
    }
    
    catch (ArithmeticException e){
      System.out.println("Exception Handled");
    }
  }
}
