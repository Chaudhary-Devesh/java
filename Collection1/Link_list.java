package Collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.addFirst(6);
        l1.addLast(9);

        Iterator it = l1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }


    }
    
}
