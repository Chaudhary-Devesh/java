import java.util.LinkedHashMap;
import java.util.Map;
public class Tree_linked {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> l1 = new LinkedHashMap<>();

        l1.put(1,"Soniya" );
        l1.put(2,"Varsha" );
        l1.put(3,"Soniya" );
        
        System.out.println(l1);

        for(int i : l1.keySet()){
            System.out.println(l1.get(i));

        }
    }
    
}
