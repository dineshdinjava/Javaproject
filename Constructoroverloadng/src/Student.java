public class Student {
    private String name;
    private int id;
    private int mark1, mark2, mark3, mark4;

    // Constructor with name and id only
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor with name, id, and two marks
    public Student(String name, int id, int mark1, int mark2) {
        this(name, id); // Call the first constructor
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    // Constructor with name, id, and four marks
    public Student(String name, int id, int mark1, int mark2, int mark3, int mark4) {
        this(name, id, mark1, mark2); // Call the second constructor
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        if (mark1 != 0 || mark2 != 0 || mark3 != 0 || mark4 != 0) {
            System.out.println("Mark 1: " + mark1);
            System.out.println("Mark 2: " + mark2);
            System.out.println("Mark 3: " + mark3);
            System.out.println("Mark 4: " + mark4);
        }
    }

    public static void main(String[] args) {
        // Create student objects with different constructors
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102, 85, 90);
        Student student3 = new Student("Charlie", 103, 75, 80, 88, 92);

        // Display details of each student
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        System.out.println("\nStudent 3 Details:");
        student3.displayDetails();
    }
}
