import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Check if the sentence is empty or null
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("The sentence is empty.");
        } else {
            // Split the sentence into words using whitespace as a delimiter
            String[] words = sentence.trim().split("\\s+");

            // Count the number of words
            int wordCount = words.length;

            // Display the word count
            System.out.println("The number of words in the sentence is: " + wordCount);
        }
    }
}
