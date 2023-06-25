public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

