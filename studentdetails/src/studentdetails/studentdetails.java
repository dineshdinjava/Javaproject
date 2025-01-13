package studentdetails;

	import java.util.Scanner;

	public class studentdetails {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for student details
	        System.out.print("Enter Roll Number: ");
	        int rollNo = scanner.nextInt();

	        scanner.nextLine(); // Consume the leftover newline

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Class: ");
	        String studentClass = scanner.nextLine();

	        System.out.print("Enter Section: ");
	        String section = scanner.nextLine();

	        // Prompt user for marks
	        double[] marks = new double[5];
	        double totalMarks = 0;

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter Mark " + (i + 1) + ": ");
	            marks[i] = scanner.nextDouble();
	            totalMarks += marks[i];
	        }

	        // Calculate average
	        double average = totalMarks / 5;

	        // Print student details
	        System.out.println("\n--- Student Details ---");
	        System.out.println("Roll Number: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Class: " + studentClass);
	        System.out.println("Section: " + section);
	        System.out.println("Marks: ");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
	        }
	        System.out.printf("Average: %.2f\n", average);

	        scanner.close();
	    }
	}

