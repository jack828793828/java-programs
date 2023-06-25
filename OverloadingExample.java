public class OverloadingExample {
    public static void main(String[] args) {
        // Function overloading examples
        System.out.println(sum(5, 10));
        System.out.println(sum(3.5, 2.7));
        System.out.println(sum(4, 6, 8));
        System.out.println(sum("Hello", "World"));
    }

    // Method to add two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public static String sum(String a, String b) {
        return a + " " + b;
    }
}

