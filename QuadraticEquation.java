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
