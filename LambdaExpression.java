
@FunctionalInterface // interface with only 1 abstract method
 interface Greet {

    void sayHello(String name);
}

@FunctionalInterface 
interface Display {

    String show(String message);
}

public class LambdaExpression {
    

    public static void main(String[] args){

        Greet greet = (String name) -> {
            System.out.println("Hello from Lambda Expression " + name);
        };

        Greet greet2 = (name) -> System.out.println("Hello again from Lambda Expression " + name);

        Greet greet3 = name -> System.out.println("Hello once more from Lambda Expression " + name);

        // greet.sayHello("Koushik");


        // Example with return type
        Display display = (message) -> {
            return "Displaying message: " + message;
        };

        display = message -> "Displaying message: " + message;

        System.out.println(display.show("Lambda Expressions are cool!"));

    }
}
