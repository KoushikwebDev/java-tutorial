public class array {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] nums = { 10, 20, 40, 50, 60 };

        int [] arr = new int[5]; // Declaration of array with size 5

        String names[] = { "Koushik", "Saha" }; // Declaration and Initialization of String array

        // Accessing array elements
        System.out.println("First Element: " + nums[0]); // 10
        System.out.println("Length of Array: " + nums.length); // 5

        // Looping through the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + ": " + nums[i]);
        }

        // enhanced for loop for array
        for(int n : nums){
            System.out.println(n);
        }


        String name = "Koushik";
        // char[] charArray = name.toCharArray(); // Convert String to char array

        for(char c : name.toCharArray()){
            System.out.println(c);
        }
    }

    public static void mixArray (){
        Object[] mixedArray = { "Koushik", 25, 75.5, true };

        for(Object obj : mixedArray){
            System.out.println(obj);
        }
    }
}


// Array is a collection of similar data types
// 1. Fixed Size => once declared, size cannot be changed
// 2. Homogeneous => same data type
// 3. Contiguous Memory Allocation => elements are stored in contiguous memory locations
// 4. Index Based => elements can be accessed using index, starting from 0
// 5. Array is an Object in Java
// 6. Can store Primitive data types and Objects
// 7. Multidimensional Arrays are also supported
// 8. Default values => int = 0, char = '\u0000', boolean = false, Object = null
// 9. Length property to get the size of the array
// 10. Arrays are mutable => elements can be changed
// 11. Arrays can be cloned using clone() method
// 12. Arrays can be sorted using Arrays.sort() method
// 13. Arrays can be searched using Arrays.binarySearch() method
// 14. Arrays can be copied using Arrays.copyOf() method
// 15. Arrays can be converted to String using Arrays.toString() method
// 16. Enhanced for loop can be used to iterate through the array
// 17. Multidimensional arrays can be created using array of arrays

