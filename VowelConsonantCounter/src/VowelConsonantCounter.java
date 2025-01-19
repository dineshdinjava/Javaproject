import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lower case to make comparison case-insensitive
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Print the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
