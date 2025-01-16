import java.util.Scanner;

public class DivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4.");
        } else {
            System.out.println(number + " is not divisible by 4.");
        }

        scanner.close();
    }
}
