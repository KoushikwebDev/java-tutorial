public class dataTypes {
    public static void main(String args[]) {
        int intVar = 100;
        int b = 200;
        double doubleVar = 99.99;
        float floatVar = 88.8f;
        long longVar = 123456789L;
        char charVar = 'D';
        boolean boolVar = true;
        String stringVar = "Java Data Types";

        final double PI = 3.14159;
        // PI = 3.14; // This will cause an error because PI is final

        double result = intVar + b;
        // System.out.println(result);
        // operators();
        // conditional();
        // ternary();
        switchCase();

    }

    // operators in java
    // arithmetic operators: +, -, *, /, %
    // relational operators: ==, !=, >, <, >=, <=
    // logical operators: &&, ||, !

    public static void operators() {
        int a = 10;
        int b = 20;
        System.out.println(a > b && b > 15); // logical AND
        System.out.println(a < b || b < 15); // logical OR
        System.out.println(!(a == b)); // logical NOT
        System.out.println(a != b); // logical NOT
    }

    public static void conditional() {

        int age = 25;

        if (age > 18) {
            System.out.println("This is true");
        } else if (age < 18) {
            System.out.println("This is false in else if");
        } else {
            System.out.println("This is false");
        }
    }

    public static void ternary(){
        int num = 10 > 1 ? 20 : 30;
        // boolean ? true value : false value
        System.out.println(num);
    }

    public static void switchCase(){
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

}
