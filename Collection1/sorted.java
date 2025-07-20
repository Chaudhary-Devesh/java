package Collection1;
import java.util.*;
public class sorted {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(3);
        l1.add(1);
        l1.add(2);
        l1.add(9);

        System.out.println(l1);

        Collections.sort(l1);

        System.out.println(l1);

        Collections.sort(l1,Collections.reverseOrder());

        System.out.println(l1);

    }
    
}
