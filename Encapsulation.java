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
