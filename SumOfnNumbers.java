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