import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class practice {
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList<>();

        list.add("Koushik");
        list.add("Saha");
        list.add("Java");

        for(String ele : list){
            System.out.println(ele);
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2); // duplicate, will not be added

        System.out.println(set);

        Map<String, Integer> map = Map.of(
            "One", 1,
            "Two", 2,
            "Three", 3
        );

        System.out.println(map.get("Two"));

        
    }
}