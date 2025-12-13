
import java.util.Arrays;
import java.util.LinkedList;
public class LinkListJava {

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.get(0); // access first element O(1)
        list.get(1); // access second element O(n)

        list.remove(); // removes first element

        list.addFirst(5); // adds element at first
        list.addLast(40); // adds element at last

        list.removeFirst(); // removes first element
        list.removeLast(); // removes last element

        list.set(1, 25); // sets element at index 1 to 25

        list.add(2, 35); // adds element 35 at index 2

        list.remove(2); // removes element at index 2

        System.out.println(list);

        //? LinkedList of String

        LinkedList<String> strList = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        
        LinkedList<String> strList2 = new LinkedList<>(Arrays.asList("Cat", "Dog"));

        strList.removeAll(strList2); // removes all elements of strList2 from strList

        System.out.println(strList);
    }
    
}
