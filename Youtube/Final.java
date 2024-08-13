package Youtube;

class A{
    void sayHello(){
        System.err.println("Hello");
    }
}


// ----- Final Class -------
final class B{
    void sayBye(){
        System.out.println("Bye");
    }
}


// ---------- Extending --------
class C extends A{
    @Override
    void sayHello(){
        System.out.println("Extended Hello");
    }
}


// ---------- Error -------------

// class C extends B{
//     @Override
//     void sayBye(){
//         System.out.println("Extended Bye");
//     }
// }




public class Final {

    // ------- Variable --------
    static final int a = 10;
    static int b = 20;


    public static void main(String[] args){
        
        b = 100;

        // ------ Will raise into error ------
        // a = 100;
    }
}
