class Hello {
    public static void main (String args[])
    {
        int num1 = 12;
        double num2 = 13.99;
        float num3 = 14.5f;
        long num4 = 123456789L;
        char ch = 'A';
        System.out.println(num1 + num2);
        display();
    }

    public static void display(){
        System.out.println("Hello World");
    }
}

//? JDK => Java Development Kit, it contains JRE + development tools like compiler, debugger, etc.
//? JRE => Java Runtime Environment, it contains libraries and other files that JVM uses at runtime
//? JVM => Java Virtual Machine, it is responsible for running Java bytecode
//? JIT => Just In Time Compiler, it is a part of JVM that improves performance by compiling bytecode to native machine code at runtime

// Jvm is a part of Jre

//? WORA => Write Once Run Anywhere

//* hirearchy of java
// Java
//   |---> Platform Independent
//            |---> Bytecode
//   |---> Platform Dependent
//            |---> Native Machine Code

// JDK contains JRE
// JRE contains JVM