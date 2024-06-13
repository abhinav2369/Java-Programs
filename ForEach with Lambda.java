import java.io.*;
import java.util.*;

public class MyClass{
  public static void main(String[] args){

    // ArrayList Initiailized
    ArrayList<Integer> arr1 = new ArrayList<Integer>();

    // Adding Value ForEach
    arr1.add(1);
    arr1.add(2);
    arr1.add(3);
    arr1.add(4);
    arr1.add(5);

    // ForEach Using Lambda Expression
    arr1.forEach(value -> System.out.println(value));
  }
}
