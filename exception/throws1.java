package exception;

class A {
     A(String a) throws ClassNotFoundException{
        Class.forName(a);
    }
}

public class throws1 {
    public static void main(String[] args) {
        
        try {
            A obj = new A("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
