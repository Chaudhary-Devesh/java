import java.util.HashMap;
import java.util.Map;

public class hash_map {
    public static void main(String[] args) {
        HashMap<String , Integer> h1 = new HashMap<>();

        h1.put("Rahul", 1);
        h1.put("Mohan", 3);
        h1.put("Kapil", 2);
        h1.put("Abhi", 8);

        System.out.println(h1);
        
        int a = h1.get("Mohan");
        System.out.println(a);


        h1.remove("Abhi");
        System.out.println(h1);


        System.out.println(h1.size());


        for(String i : h1.keySet()){
            System.out.println(i);

        }

        for(int i : h1.values()){
            System.out.println(i);

        }
    }
    
    
}
