package exception;
import java.util.*;

public class type_exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];


        int i=0;
        int j=0;

        try{
            System.out.println(18/i);
            System.out.println(a[5]);
            int b = sc.nextInt();
        }catch(ArithmeticException e){
            System.out.println("Divide by zero ");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay  in your limit");
        }catch(InputMismatchException e){
            System.out.println("Enter correct number");

        }catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("Bye!");
        }
    
    }
    
}
