import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        // Example code demonstrating CopyOnWriteArrayList can be added here

        List<String> arrayList = new ArrayList<>(Arrays.asList("Milk", "Banana", "Chana"));


        // here it will throw ConcurrentModificationException
        for (String item : arrayList) {
            if (item == "Milk") {
                arrayList.add("Chini");

            }
            System.out.println(item);
        }


        // Using CopyOnWriteArrayList to avoid ConcurrentModificationException
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>(Arrays.asList("Milk", "Banana", "Chana"));

        for (String item : cowList) {
            if (item == "Milk") {
                cowList.add("Chini");
            }
            System.out.println(item);
        }
    }
}


// CopyOnWriteArrayList is a thread-safe variant of ArrayList
// It creates a new copy of the underlying array on every write operation (add, set, remove)
// This makes it suitable for scenarios with frequent reads and infrequent writes
// Iterators of CopyOnWriteArrayList do not throw ConcurrentModificationException
// because they operate on a snapshot of the array at the time the iterator was created