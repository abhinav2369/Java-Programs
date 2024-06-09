public class MyClass{
  public static void main(String[] args){
    int[] arr = new int[4];

    try{
      arr[5]=0;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Indexing Not Possible");
    }
    System.out.println("Outside try catch");
  }
}
