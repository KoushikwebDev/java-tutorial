interface Computer {
    int MAX_SPEED = 5000; // constant variable, by default public, static and final

    void Compile (); // abstract method, by default public and abstract, abstract means whoever implements this interface must implement this method

    default void shutdown() {
        System.out.println("Shutting down the computer");
    } // concrete method, supported from Java 8+, default, static, private(Java 9+)
}
// another interface
interface Software {
    void run();
}


// we can use multiple inheritance with interfaces
class Laptop implements Computer, Software {
    public void Compile (){
        System.out.println("Compiling with laptop");
    }

    public void run() {
        System.out.println("Running software on laptop");
    }
}

class Desktop implements Computer {
    public void Compile (){
        System.out.println("Compiling with desktop");
    }
}


class Developer {
    public void DoCode(Computer machine){
        machine.Compile();
    }
}


public class Interface {
    public static void main(String[] args) {

        Developer dev = new Developer();

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        dev.DoCode(lap);
        dev.DoCode(desk);

        System.out.println(Computer.MAX_SPEED); // => 5000

        lap.shutdown(); // calling default method from interface
       
    }
}


// Interface in Java
// 1. An interface is a reference type in Java that can contain only abstract methods, default methods, static methods, and constant variables.
// 2. Interfaces are used to define a contract that implementing classes must adhere to.
// 3. A class can implement multiple interfaces, allowing for multiple inheritance of type.
// 4. Interfaces are useful for achieving abstraction and polymorphism in Java.
//* Interfaces are commonly used to define capabilities that can be shared across different classes.
