package Collection1;

import java.util.*;

public class tree_set {

    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<>();

        t1.add(2);

        t1.add(0);

        t1.add(1);

        t1.add(4);

        System.out.println(t1);

        System.out.println(t1.contains(5));

        t1.remove(4);

        for(int i : t1){
            System.out.println(i);
        }

        System.out.println(t1.size());
    }
}
