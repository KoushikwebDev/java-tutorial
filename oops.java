class Person {
    private int age;
    private String name;
    
    static int globalCount = 0;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello from Person class" + name);
    }

    public void setValue (int age) {
        this.age = age;
    }

    // overloaded method, same name different parameters
    public void setValue (String name) {
        this.name = name;
    }
}

class Student extends Person {

  public Student() {
        super(18, "Default Student");
    }

    int studentId = 101;

    @Override // Method Overriding, it is already present in Person class
    public void greet() {
        System.out.println("Hello from Student class" + globalCount); // Accessing static variable from parent class
    }
}

public class oops {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        Person person1 = new Person(20, "Koushik");
        person1.greet();
        // System.out.println("Age: " + person1.age); // Error: age has private access in Person

        Student student1 = new Student();

        student1.greet();
        System.out.println("Student ID: " + student1.studentId);
        // System.out.println("Age from Student: " + student1.age); // Error: age has private access in Person

        System.out.println("Global Count: " + Person.globalCount); // Accessing static variable, without creating an object
    }
}


// OOPs Concepts in Java
// 1. Encapsulation => Data Hiding
// 2. Inheritance => Single, Multiple, Multilevel
// 3. Polymorphism => Overloading and Overriding
// 4. Abstraction
//* Abstraction : User ko sirf important features dikhaye jaate hain
//* Implementation details chhupaye jaate hain



// Object stores in Heap Memory
// Reference variable stores in Stack Memory

// this keyword => refers to current class instance variable
// super keyword => refers to parent class instance variable
// static keyword => belongs to the class rather than instance of the class, shared among all instances
// final keyword => used to declare constants, prevent method overriding and inheritance

// Method Overriding => same method name and parameters in parent and child class
// Method Overloading => same method name with different parameters in the same class

// static variables store in Class Memory Area


// * every class creates a separate .class file during compilation


//* Static methods belong to the class, They can run without creating an object, But agar methods non-static hote, toh woh object ke sath hi exist karte hain. Static context (main method) se unko direct call nahi kiya ja sakta.