public class loops {
    public static void main(String[] args) {
        // for , while , do while
        int n = 7;
        // while
        while (n < 6) {
            System.out.println("Hello World " + n);
            n++;
        }


        // do while
        do {
            System.out.println("Inside do while loop " + n);
        } while (n < 6);

        // for loop
        for (int i =0; i<5; i++){
            System.out.println("Inside for loop " + i);
        }
    }
}
