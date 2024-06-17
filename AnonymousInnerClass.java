class A{
    void sayHello(){
        System.out.println("Hello");
    }
    void sayBye(){
        System.out.println("Bye");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        // Creating a Instance of class
        A a = new A();
        a.sayHello();
        a.sayBye();

        // Creating Instance of class with over-riding it's one function using anonymous inner class
        A b = new A(){
            void sayHello(){
                System.out.println("Inner Anonymous Hello");
            }
        };
        b.sayHello();
        b.sayBye();
    }
}
