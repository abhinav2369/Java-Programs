import java.io.*;
import java.util.*;

public class ArrayListCreation{
  public static void main(String[] args){
    ArrayList<Integer> arr1  = new ArrayList<Integer>(5);
    ArrayList<Integer> arr2  = new ArrayList<Integer>();
 
    System.out.println(arr1);
    System.out.println(arr2);

    for (int i=1 ; i<11 ; i++){
      arr1.add(i);
      arr2.add(10+i);
    }

    System.out.println(arr1);
    System.out.println(arr2);
  }
}
