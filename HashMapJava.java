import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapJava {

    public static void main(String[] args) {

        HashMap<String, Integer> mapList = new HashMap<>();

        mapList.put("apple", 1);
        mapList.put("banana", 2);
        mapList.put("apple", 3); // updates value for key "apple"
        System.out.println(mapList);

        for (String key : mapList.keySet()) {
            System.out.println(key + " : " + mapList.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = mapList.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // methods

        mapList.containsKey("banana"); // true
        mapList.containsValue(3); // true
        mapList.remove("banana"); // removes key "banana"
        mapList.clear(); // removes all elements

    }
}
