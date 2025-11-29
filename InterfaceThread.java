class A implements Runnable {


    // overriding run() method, thread starts execution from run() method
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A: " + i);

            // adding sleep time to let other thread execute
        }
    } 
}

class B implements Runnable {


    // overriding run() method, thread starts execution from run() method
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B: " + i);

            // adding sleep time to let other thread execute
        }
    } 
}


public class InterfaceThread {
    public static void main (String[] args) {

        A a = new A();
        B b = new B();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start(); // start() method calls the run() method internally

        threadA.setPriority(Thread.MAX_PRIORITY); // setting priority to MAX


        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread ended");

        //* now when we use join method, main thread will wait for child thread to complete its execution, then only main thread will continue its execution.

       //? otherwise, main thread may complete its execution before child threads complete their execution.
       
    }
}

// checked exception is an exception that is checked at compile-time by the compiler.
// unchecked exception is an exception that is not checked at compile-time, but at runtime.


// In Java, there are two main ways to create a thread: by extending the Thread class or by implementing the Runnable interface.
