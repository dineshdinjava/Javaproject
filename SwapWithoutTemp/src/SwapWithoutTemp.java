public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 10; // Example values
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping without a third variable
        a = a + b; // Step 1: a becomes the sum of a and b
        b = a - b; // Step 2: b becomes the original value of a
        a = a - b; // Step 3: a becomes the original value of b

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
