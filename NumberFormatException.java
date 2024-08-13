

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

