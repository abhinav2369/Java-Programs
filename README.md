## Programs 🌟

### ➡️ Abstract Class
```java
// Abstract Class
abstract class Car{

    public void run(){
        System.err.println("Running");
    }

    // Abstract Method
    public abstract void stop();
}


// Extending the Car class so it's instance can be created
class Toyota extends Car{

    @Override
    public  void stop(){
        System.out.println("Stop");
    }
}


public class AbstractClass{
    public static void main(String[] args) {
        
        Toyota abc = new Toyota();
        abc.run();
        abc.stop(); 
        
    }
}
```

### ➡️ Annoymous Inner Class
```java
class A{
    void sayHello(){
        System.out.println("Hello");
    }
    void sayBye(){
        System.out.println("Bye");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        // Creating a Instance of class
        A a = new A();
        a.sayHello();
        a.sayBye();

        // Creating Instance of class with over-riding it's one function using anonymous inner class
        A b = new A(){
            void sayHello(){
                System.out.println("Inner Anonymous Hello");
            }
        };
        b.sayHello();
        b.sayBye();
    }
}
```

### ➡️ Arithematic Calculator
```java
import java.util.Scanner;

public class ArithematicCalculator{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Number 1
        System.out.print("Enter number a : ");
        int a  = scanner.nextInt();

        // Number 2
        System.out.print("Enter Number b : ");
        int b = scanner.nextInt();

        System.out.println("Operations --- \n1.Add \n2.Subtract \n3.Multiply \n4.Divide");
        int option = scanner.nextInt();

        int ans = 0;
        
        switch(option){
            case 1:
                ans = a+b;
                break;
            case 2:
                ans = a-b;
                break;
            case 3:
                ans = a*b;
                break;
            case 4:
                if (b != 0) {
                    ans = a / b;
                } else {
                    System.out.println("Cannot divide by zero");
                }
        }
        System.err.println("Answer is " + ans);
    }
}
```

### ➡️ Array
```java
public class Array{

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
```

### ➡️ ArrayClass
```java
public class ArrayClass {
    public static void main(String[] args) {
        
        // ---------- Integer Array ----------
        int[] arr1 = {1,2,3,4,5};
        for (int i=0 ; i<arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("---- Using For Each loop ------");
        for(int i:arr1){
            System.out.println(i);
        }



        // ---------- String Array -----------
        String[] arr2 = {"Abhilesh","Abhinav", "Abhishek"};
        for (int i=0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("---- Using For Each loop ----");
        for(String i: arr2){
            System.out.println(i);
        }

        

        // ---------- Boolean Array -----------
        Boolean[] arr3 = {true, false, false};
        for (int i=0 ; i<arr3.length ; i++){
            System.out.println(arr3[i]);
        }

        System.out.println("---- Using For Each loop ----");
        for(Boolean i: arr3){
            System.out.println(i);
        }
    }
}

```

### ➡️ Array Index Out Of Bounds Exception
```java
public class ArrayIndexOutOfBoundsExceptionClass{
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
```

### ➡️ ArrayList
```java
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
```

### ➡️ Encapsulation
```java
public class Encapsulation {

    static String name = "Hello World";

    int a = 10;
    final int b = 10;

    public static void main(String[] args){
        System.out.print(name);

        // Non static method cannot be called in static method
        // number()
        // Same for the Variable (attributes)
    }

    void number(){
        System.out.print(a);
        System.err.println(b);
    }
}
```

### ➡️ Even Odd
```java
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scanner.nextInt();

        if (a%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
```

### ➡️ For Each with Lambda
```java
import java.util.*;

public class ForEachWithLambda{
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
```

### ➡️ IndexOf
```java
public class IndexOfJava{
  public static void main(String[] args){

    // Declaring Word
    String word = "abcdefghijklmnopqrstuvwxyz";

    
    // ------------- Index -------------
    
    System.out.println(word.indexOf("cd"));
    // 2
    
    System.out.println(word.indexOf("az"));
    // -1
  }
```

### ➡️ NonInnerClass
```java
class A{
    void NonInnerClassFunction(){
        System.out.println("Not Inner Class");
    }

    // Inner Class
    static class B{
        void InnerClassFunction(){
            System.out.println("Inner Class");
        }
    }
}

public class InnerCLass {
    public static void main(String[] args){
        
        // Making Instance of Class A
        A a = new A();
        a.NonInnerClassFunction();

        // Making Instance of Class B
        A.B b = new A.B();
        b.InnerClassFunction();
    }
    
}
```

### ➡️ Number Fornat Exception
```java
public class NumberFormatException {
    public static void main(String[] args) {
        
        String number = "Hello";

        try {
            int a = Integer.parseInt(number);
        } 
        catch (java.lang.NumberFormatException e) {
            System.out.print("Null Pointer Exception");
        }
    }
}
```

### ➡️ Palindrome
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter a number : ");
        int num = scanner.nextInt();
        int temp = num;
        int rev = 0;

        while (num > 0){
            rev = rev*10 + (num%10);
            num = num/10;
        }

        if (rev==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}
```

### ➡️ PrimeNumber
```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int a = scanner.nextInt();

        boolean flag = true;

        for (int i=2 ; i<a ; i++){
            if (a%i == 0){
                System.out.println("Not Prime Number");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Prime Number");
        }
    }
}

```

### ➡️ Quadratic Equation
```java
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a values for equation ax^2 + bx + c: ");

        System.out.print("a = ");
        double a = scanner.nextInt();

        System.out.print("b = ");
        double b = scanner.nextInt();

        System.out.print("c = ");
        double c = scanner.nextInt();

        double d = ((Math.pow(b,2)) - (4*a*c)) ;

        if (d<0){
            System.out.print("Root are imaginary");
        }
        else if(d==0){
            System.out.print("Roots are Equal ");
            System.out.println(-b/(2*a));
            System.out.println(-b/(2*a));
        }
        else{
            double d1 = (-b + Math.pow(d,0.5))/(2*a);
            double d2 = (-b - Math.pow(d,0.5))/(2*a);
            System.out.println(d1);
            System.out.println(d2);
        }
    }
}
```

### ➡️ Static Keyword Same Class
```java
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
```
### ➡️ String Built in Method
```java
public class StringBuiltInMethod{
  public static void main(String[] args){

    // Declaring Sentence
    String sentence = "abcdefghijklmnopqrstuvwxyz";

    // Printing Length of Sentence
    System.out.println(sentence.length());

    // Printing Sentence
    System.out.println(sentence);

    // Printing uppercase using return value
    System.out.println(sentence.toUpperCase());

    // Printing Sentence
    System.out.println(sentence);

    // changing the value of the sentence
    sentence = sentence.toUpperCase();

    // Printing Sentence
    System.out.println(sentence);
  }
}
```
### ➡️ Sum of n Number
```java
import java.util.Scanner;

public class SumOfnNumbers{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter a Number : ");
        int a = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= a; i++) {
            sum = sum + i;   
        }
        
        System.err.println("Sum = " + sum);
    }
}
```
### ➡️ Matrix Multiplication
```java
import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        // Read first matrix
        System.out.println("Enter the elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Read second matrix
        System.out.println("Enter the elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result matrix
        System.out.println("The resulting matrix after addition is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
```
### ➡️ 
```java
```
### ➡️ 
```java
```
