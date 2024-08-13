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
