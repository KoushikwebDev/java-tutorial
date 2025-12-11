
 interface Greeting {

    void display();
    
}

public class AnonymousClass {
 
    
    public static void main(String[] args){

        Greeting greet = new Greeting() {
            @Override
            public void display() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        greet.display(); 

    }
}
