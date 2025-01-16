		
		import java.util.Scanner;

		public class AddnumbersInRange {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input the two numbers
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Check if both numbers are within the range
		        if (num1 >= 500 && num1 <= 520 && num2 >= 500 && num2 <= 520) {
		            int sum = num1 + num2; // Calculate the sum
		            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		        } else {
		            System.out.println("Both numbers must be between 500 and 520 (inclusive).");
		        }
		        
		        scanner.close();
	}

}
