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