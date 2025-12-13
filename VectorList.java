import java.util.Arrays;
import java.util.Vector;
import java.util.LinkedList;

public class VectorList {
    
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>(5); // initial capacity 5
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60); // exceeds initial capacity, resizes
        System.out.println(vector.capacity()); // capacity should be 10 now


        // Setting custom increment size
        Vector<String> strVector = new Vector<>(5, 3); // initial capacity 5, increment 3
        strVector.add("A");
        strVector.add("B");
        strVector.add("C");
        strVector.add("D");
        strVector.add("E");
        strVector.add("F"); // exceeds initial capacity, resizes by increment 3
        System.out.println(strVector.capacity()); // capacity should be 8 now


        // Creating Vector from another collection
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        Vector<Integer> vectorFromList = new Vector<>(list); // create Vector from LinkedList
        System.out.println(vectorFromList); // [1, 2, 3, 4, 5]

        // loop
        for(int i = 0; i < vectorFromList.size(); i++){
            System.out.println(vectorFromList.get(i));
        }

        for(Integer val : vectorFromList){
            System.out.println(val);
        }
    }
}

// by default, Vector doubles its size when capacity is exceeded
// So new capacity = old capacity * 2
// But we can set custom increment size while creating Vector

// Vector is synchronized (thread-safe) whereas ArrayList is not
// So Vector has overhead of synchronization so generally ArrayList is preferred in single-threaded scenarios
