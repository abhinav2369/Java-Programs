
// Sealed Class
sealed class Abhinav permits Abhilesh, Patel{
    public void sayHello(){
        System.out.println("Hello");
    }
}


// Non Sealed Class
non-sealed class Abhilesh extends Abhinav{
    @Override
    public void sayHello(){
        System.out.println("Bye");
    }
}


// Non Sealed Class
non-sealed class Patel extends Abhinav{
    @Override
    public void sayHello(){
        System.out.println("Bye");
    }
}


public class SealedClasses {
    public static void main(String[] args) {

        // Creating Instance of sealed class
        Abhinav abhinav = new Abhinav();
        abhinav.sayHello();

        // Overriding sealed class with permits
        Abhilesh abhilesh = new Abhilesh();
        abhilesh.sayHello();

        Patel patel = new Patel();
        patel.sayHello();
    }
}
