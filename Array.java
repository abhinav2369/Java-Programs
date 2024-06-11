public class MyClass{

  // Array Declaration
  static String[] array = {"abc","def","ghi","ijk"};

  // Main method
  public static void main(String[] args){
    forloop();
    foreach();
  }

  // Using For Loop
  public static void forloop(){
    for (int i=0 ; i < array.length ; i++){
      System.out.println(array[i]);
    }
  }

  // Using For Each
  public static void foreach(){
    for (String i : array){
      System.out.println(i);
    }
  }
}
