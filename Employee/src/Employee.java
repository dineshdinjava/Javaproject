class Employee {
    // Instance variables
    private int id;
    private String name;
    private int age;
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating an employee object using the parameterized constructor
        Employee employee = new Employee(101, "Dinesh", 32, 55000.50);

        // Printing employee details
        employee.displayDetails();
    }
}
