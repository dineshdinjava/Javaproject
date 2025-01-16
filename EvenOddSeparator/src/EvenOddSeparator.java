import java.util.Scanner;

public class EvenOddSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from the user
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("\nEven numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else if (i % 2 != 0) {
                // Continue to the next iteration for odd numbers
                continue;
            }
        }

        System.out.println("\n\nOdd numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            } else if (i % 2 == 0) {
                // Continue to the next iteration for even numbers
                continue;
            }
        }

        scanner.close();
    }
}
