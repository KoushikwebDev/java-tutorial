import java.util.LinkedList;
import java.util.Stack;


// LIFO data structure => Last In First Out
public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Integer top = stack.peek(); // returns top element without removing

        Integer popped = stack.pop(); // removes and returns top element



        System.out.println(top + " " + popped); // 30 30

        // LinkedList can also be used as stack
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        list.getLast(); // peek 

        list.removeLast(); //  pop
    }
}


// Stack extends Vector class
// So it is synchronized (thread-safe) but has performance overhead due to synchronization

// So in single-threaded scenarios, consider using Deque implementations like ArrayDeque for better performance