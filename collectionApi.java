import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// import java.lang.*; //? in all java files java.lang is imported by default

public class collectionApi {
    public static void main(String[] args){
        // Collection API in Java
        // 1. List => ordered collection, allows duplicates (ArrayList, LinkedList, Vector)
        // 2. Set => unordered collection, no duplicates (HashSet, LinkedHashSet, TreeSet)
        // 3. Map => key-value pairs, no duplicate keys (HashMap, LinkedHashMap, TreeMap)

        // Example of List
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // allows duplicates
        System.out.println("List: " + list);

        // Example of Set
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicates not allowed
        System.out.println("Set: " + set);

        // Example of Map
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Apple", 3); // updates value for key "Apple"
        System.out.println("Map: " + map);


        // Using Map.of() to create an immutable map
            Map<String, Integer> map2 = Map.of(
            "One", 1,
            "Two", 2,
            "Three", 3
        );

        System.out.println(map2.get("Two"));
    }
}


// Array is fixed-size and can store primitives.
// ArrayList is dynamic, part of collections framework, and provides many utility methods but only stores objects.


// "int is a primitive with no methods. Integer is its wrapper class that provides utility methods and allows null, generics, and object operations."

// Collections can only store Objects, not primitives. That’s why Integer is required, and autoboxing simply makes working with wrappers easier.