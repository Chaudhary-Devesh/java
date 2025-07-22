package exception;
import java.util.Scanner;
public class try_Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Bye");
        }
    }

}
