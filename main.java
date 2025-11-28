import demo.utils.B;
// import demo.utils.*; // wildcard import to import all classes from utils package

public class main {
    public static void main(String[] args) {
       B bObj = new B();
       bObj.display();
    }
}


//? Access modifiers in Java
// 1. public => accessible from anywhere
// 2. private => accessible only within the class
// 3. protected => accessible within the same package and subclasses
// 4. default (package-private) => accessible only within the same package, same class 

//* final => constant variable or method that cannot be overridden