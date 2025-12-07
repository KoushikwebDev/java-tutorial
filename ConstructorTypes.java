class Test {
    public Test() {
        System.out.println("Public");
    }

    protected Test(int x) {
        System.out.println("Protected");
    }

    Test(String msg) {  // default (package-private)
        System.out.println("Default");
    }

    private Test(double d) {
        System.out.println("Private");
    }
}

// Constructor Types in Java
// 1. Public Constructor => Accessible from anywhere
// 2. Protected Constructor => Accessible within the same package and subclasses
// 3. Default (Package-Private) Constructor => Accessible only within the same package
// 4. Private Constructor => Accessible only within the same class
//* Private Constructor is used in Singleton Design Pattern to restrict instantiation of a class to a single instance