package generic1;

class Box1<T>{

    T a;
    
    Box1(T a){
        this.a = a;

    }
    void show(){
        System.out.println(a);
    }
}
class Box2<T extends  Number>{
    T a;
    void set(T a){
        this.a=a;
    }

    T get(){
        return a;
    }

}

public class firstgen {
    public static <T> void Devesh(T a){
        System.out.println(a);

    }
    public static void main(String[] args) 
    {

        Box1<String> b = new Box1<>("Devesh");
        Devesh("Devesh");
        Devesh(89);
        Devesh(4.4422);
        

        b.show();


         Box2<Integer> b1 = new Box2<>();

        b1.set(8);
        System.out.println(b1.get());
    }
    
}
