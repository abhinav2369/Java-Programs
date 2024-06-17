class A{
    void NonInnerClassFunction(){
        System.out.println("Not Inner Class");
    }

    // Inner Class
    static class B{
        void InnerClassFunction(){
            System.out.println("Inner Class");
        }
    }
}

public class InnerCLass {
    public static void main(String[] args){
        
        // Making Instance of Class A
        A a = new A();
        a.NonInnerClassFunction();

        // Making Instance of Class B
        A.B b = new A.B();
        b.InnerClassFunction();
    }
    
}
