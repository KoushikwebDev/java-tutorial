public class string {

    public static void main(String args[]){
        String name = "Koushik"; // String Literal, stored in String Pool and is immutable
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(2, 5));

        stringObject();
        stringBuffer();
    }   

    public static void stringObject(){
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false, different memory locations
        System.out.println(s1.equalsIgnoreCase(s2)); // it is for the case insensitive comparison
        System.out.println(s1.equals(s2)); // true, same content
    }

    public static void stringBuffer(){
        StringBuffer sb = new StringBuffer("Koushik"); // mutable and synchronized, thread safe
        sb.append(" Saha");
        System.out.println(sb); // Koushik Saha
    }

    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder("Koushik"); // mutable, not synchronized
        sb.append(" Saha");
        System.out.println(sb); // Koushik Saha
    }

    public static void stringMethods(){
        String str = "  Hello World  ";
        System.out.println(str.trim()); // "Hello World"
        System.out.println(str.toUpperCase()); // "  HELLO WORLD  "
        System.out.println(str.replace("World", "Java")); // "  Hello Java  "
    }
}



//*  private final char value[];
// String s2 = "Hello";
// String s1 = "Hello";

// Same object share hota hai 👇 String Pool
// ➡ Memory efficient, faster


//* String is Immutable => once created, it cannot be changed by any thread, this makes it thread safe
//* StringBuffer and StringBuilder are Mutable => can be changed
//* StringBuffer is Synchronized => Thread Safe, but slower
//* StringBuilder is not Synchronized => Not Thread Safe, but faster

//? Synchronized = ek time me ek hi thread modify kar sakta hai

