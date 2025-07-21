import java.util.Map;
import java.util.TreeMap;

public class tree_map {

    public static void main(String[] args) {

        TreeMap<String, Integer> t1 = new TreeMap<>();

        t1.put("devesh",9);
        t1.put("deshu",8);
        t1.put("bhola",5);

        System.out.println(t1);

        for(String i : t1.keySet()){
            System.out.println(i);
        }
    }
    
}
