class A extends Thread {

    // overriding run() method, thread starts execution from run() method
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A: " + i);

            // adding sleep time to let other thread execute
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    } 
}

class B extends Thread {

    // overriding run() method, thread starts execution from run() method
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B: " + i);
        }
    } 
}


public class ThreadTest {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();

        threadA.start(); // start() method calls the run() method internally

        threadA.setPriority(Thread.MAX_PRIORITY); // setting priority to MAX
        threadB.start();
    }
}


// In Java, there are two main ways to create a thread: by extending the Thread class or by implementing the Runnable interface.
// 1. Extending the Thread class:
//    - You create a new class that extends the Thread class.
//    - You override the run() method to define the code that constitutes the new thread's task.
//    - You create an instance of your class and call the start() method to begin execution of the thread.
// 2. Implementing the Runnable interface:
//    - You create a new class that implements the Runnable interface.
//    - You implement the run() method to define the code that constitutes the new thread's task.
//    - You create an instance of your class and pass it to a Thread object, then call the start() method on the Thread object to begin execution of the thread.

//* The Runnable interface is generally preferred when you want to separate the task from the thread itself, allowing for better resource sharing and flexibility, especially when your class needs to extend another class.