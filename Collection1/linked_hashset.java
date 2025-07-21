package Collection1;
import java.util.*;
public class linked_hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();

        l1.add(1);
        l1.add(7);
        l1.add(9);
        l1.add(0);

        System.out.println(l1);

        System.out.println(l1.contains(3));

        l1.remove(9);

        System.out.println(l1);

        System.out.println(l1.size());

    }
    
}
