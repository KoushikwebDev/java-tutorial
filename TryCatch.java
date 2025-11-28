public class TryCatch {
    public static void main(String[] args) {
        demo(); // calling demo method
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            // throw new Exception("Custom Exception Thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static void demo() {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Demo method execution completed.");
        }
    }
}

// Try-Catch in Java
// 1. The try block contains code that might throw an exception.
// 2. The catch block handles the exception if it occurs.
// 3. Multiple catch blocks can be used to handle different types of exceptions.
// 4. The finally block contains code that will always execute, regardless of whether an exception occurred or not.
// 5. It is used for graceful error handling and to prevent program crashes.
// 6. Common exceptions include ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException,IOException etc.


// throw vs throws in Java
// 1. throw is used to explicitly throw an exception from a method or block of code.
// 2. throws is used in method signatures to declare that a method may throw one or more exceptions.
// 3. throw is followed by an instance of an exception, while throws is followed by exception class names.
// 4. throw is used within a method body, while throws is used in method declarations.

//* In nested methods calling like callback hell in javascript in that time we can use try catch block to handle the error properly or throw the error to the parent method