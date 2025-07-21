package Collection1;
import java.util.*;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();

        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(5);

        System.out.println(h1);

        System.out.println(h1.contains(4));

        h1.remove(5);

        System.out.println(h1);

        for(int i : h1){
            System.out.println(i);
        }

        
    }
    
}
