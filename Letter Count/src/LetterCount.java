import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Initialize a counter for letters
        int letterCount = 0;

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        // Display the result
        System.out.println("The total number of letters in the sentence is: " + letterCount);

        // Close the scanner
        scanner.close();
    }
}
