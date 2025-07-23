package exception;

class Devesh extends Exception{
    Devesh(String s){
        super(s);
    }

}

public class throw2 {
    public static void main(String[] args) {

        String name = "";
        try{
            if(name == ""){
                throw new Devesh("Enter the name!");
            }else{
                System.out.println(name);
            }
        }catch(Devesh e){
            System.out.println(e);
        }
        
    }
    
}
