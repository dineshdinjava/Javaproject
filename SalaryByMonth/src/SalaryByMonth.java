public class SalaryByMonth {

    // Enum to represent the months of the year
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        // Fixed salary for demonstration purposes
        double monthlySalary = 10000.00;

        // Loop through each month in the enum
        for (Month month : Month.values()) {
            System.out.println("Salary for " + month + ": $" + monthlySalary);
        }
    }
}
