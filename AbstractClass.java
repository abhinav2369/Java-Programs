// Abstract Class
abstract class Car{

    public void run(){
        System.err.println("Running");
    }

    // Abstract Method
    public abstract void stop();
}


// Extending the Car class so it's instance can be created
class Toyota extends Car{

    @Override
    public  void stop(){
        System.out.println("Stop");
    }
}


public class AbstractClass{
    public static void main(String[] args) {
        
        Toyota abc = new Toyota();
        abc.run();
        abc.stop(); 
        
    }
}