
abstract class Computer {
    static int MAX_SPEED = 5000; // constant variable, by default public, static and final
    public abstract void Compile ();
    // public abstract void Compile2 ();
}

class Laptop extends Computer {


    public void Compile (){
        System.out.println("Compiling with laptop");
    }
}

class Desktop extends Computer {


    public void Compile (){
        System.out.println("Compiling with desktop");
    }
}

class Developer {
    public void DoCode(Computer machine){
        machine.Compile();
    }
}


public class Abstract {
    public static void main(String[] args) {

        Developer dev = new Developer();

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        dev.DoCode(lap);
        dev.DoCode(desk);

        System.out.println(Computer.MAX_SPEED); // => Cannot access non-static variable in static context
       
    }
}

// Abstract class in Java, can create object from itself

// 1. An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body).
// 2. Abstract classes are meant to be subclassed, and the subclasses must provide implementations for the abstract methods.
// 3. An abstract class can have both abstract methods and concrete methods (methods with a body).
// 4. Abstract classes are used to provide a common interface and share code among related classes.
//* Abstract classes are useful when you want to define a template for a group of related classes.


// ❓ Can an interface have a concrete method?
// ✔ Yes, using default or static method (Java 8+)

// ❓ Can an abstract class have zero abstract methods?
// ✔ Yes! But then why abstract? → To prevent object creation
