@FunctionalInterface
interface InnerFunctionalInterface {

    void SayHello();

    default void SayBye(){
        System.out.println("Bye");
    }
    static void GetLoss(){
        System.out.println("Get Loss");
    }
}

public class FunctionalInterfaceClass {
    public static void main(String[] args){

        InnerFunctionalInterface ifi = ()-> System.err.println("Hello");

        
        ifi.SayHello();
        ifi.SayBye();
        InnerFunctionalInterface.GetLoss();
    }
}
