package exception;

public class try_catch {
    public static void main(String[] args) {
        int a =0 ;
        int b=10;

        try{
            System.out.println(b/a);
        }catch(Exception e){
            System.out.println("Something wrong happen");

        }finally{
            System.out.println("Completed");
        }
    }
    
}
