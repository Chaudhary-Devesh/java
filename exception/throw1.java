package exception;
public class throw1 {
    public static void main(String[] args) {
        int i=0;
      

        try{
            if(i==0){
                throw new ArithmeticException("I dont want zero!");
            }else{
                int j=18/i;
                System.out.println(j);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    
}
