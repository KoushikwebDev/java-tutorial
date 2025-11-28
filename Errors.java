public class Errors {
    public static void main(String[] args) {
        // Syntax Error
        // System.out.println("Hello World"

        // Runtime Error
        int a = 5;
        int b = 0;
        // int c = a / b; // Uncommenting this line will cause ArithmeticException: / by zero, runtime error, exception will stop the program

        // Logical Error
        int x = 10;
        int y = 20;
        int sum = x - y; // Logical error: should be x + y
        System.out.println("Sum: " + sum); // Output will be incorrect
    }
}

// Types of Errors in Java
// 1. Syntax Errors: Mistakes in the code that violate the rules of the programming language.
// 2. Runtime Errors: Errors that occur during the execution of the program.
// 3. Logical Errors: Errors in the logic of the program that lead to incorrect results
// 4. Compilation Errors: Errors detected by the compiler during the compilation process.
