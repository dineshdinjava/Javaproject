// Java program to add two numbers using a default constructor
class AddTwonumbers {
    int num1; // First number
    int num2; // Second number
    int sum;  // Sum of the two numbers

    // Default constructor
    AddTwonumbers() {
        // Initialize the numbers with default values
        num1 = 20; // Example value
        num2 = 30; // Example value

        // Calculate the sum
        sum = num1 + num2;
    }

    // Method to display the result
    void displaySum() {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an object of the class
        AddTwonumbers obj = new AddTwonumbers();

        // Display the sum
        obj.displaySum();
    }
}
