package Collection1;
import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Ram");
        l1.add("Devesh");
        l1.add("Shyam");
        l1.add("Aman");
        l1.add(0,"Kavita");

        Iterator<String> it =  l1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        l1.set(0,"Mohan");
        String a = l1.get(0);
        System.out.println(a);

        l1.remove(0);
        // l1.clear();
        l1.size();

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        for(String i : l1){
            System.out.println(i);
        }

        Collections.sort(l1);

        System.out.println(l1);

        List <Integer> l2 = new ArrayList<>();



     
        
    }

     
}
