


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListCollection {

    public static void main(String[] args){


        List<Integer> list = new ArrayList<>(123);
        list.add(10);

        System.out.println(list.size());

        List<Integer> list2 = Arrays.asList(1,2,3); // fixed size list
        // list2.add(4); // UnsupportedOperationException

        System.out.println(list2.size());

        List<Integer> list3 = new ArrayList<>(list2); // mutable list
        list3.add(4);
        System.out.println(list3.size());
    }
    
    List<Integer> list4 = List.of(1,2,3); // immutable list
    // list4.add(4); // UnsupportedOperationException
}


// ArrayList default capacity is 10
// After filling 10 elements, it increases its size by 50%
// So new capacity = 10 + 10/2 = 15
// Similarly, when we fill 15 elements, new capacity = 15 + 15/2 = 22
// This resizing continues as we keep adding elements beyond current capacity

