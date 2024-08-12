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

