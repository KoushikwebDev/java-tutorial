import java.util.ArrayList;

public class ThreadSafe {

    public static void main(String[] args) {
        // Example code demonstrating thread safety can be added here
        ArrayList<Integer> list = new ArrayList<>();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    list.add(i);
                }
            }
        };

            t1.start();
            t2.start();

        try {

            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("List 1 size: " + list.size());

    }
}

// Note: ArrayList is not thread-safe. In a multi-threaded environment, consider using Collections.synchronizedList or CopyOnWriteArrayList for thread safety.

// join() method makes the calling thread wait until the thread on which join is called completes its execution.

// If we use vectors instead of ArrayLists, they are thread-safe by default.