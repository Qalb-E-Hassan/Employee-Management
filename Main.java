public class Main {

    // Method 1: Calculate salary
    public static int calculateSalary(int hours, int rate) {
        return hours * rate;
    }

    // Method 2: Find salary category
    public static String getCategory(int salary) {

        if (salary >= 50000) {
            return "High";
        }
        else if (salary >= 30000) {
            return "Medium";
        }
        else {
            return "Low";
        }
    }

    // Method 3: Check valid working hours
    public static boolean isValid(int hours) {
        return hours >= 0 && hours <= 60;
    }

    // Main method
    public static void main(String[] args) {

        String[] names = {"Hina", "Omar", "Zara", "Bilal"};

        int[] hours = {40, 25, 70, 55};

        int rate = 1000;

        int validEmployees = 0;
        int totalSalary = 0;

        // Loop through all employees
        for (int i = 0; i < names.length; i++) {

            // Check working hours
            if (!isValid(hours[i])) {

                System.out.println("Invalid hours for " + names[i]);

                continue;
            }

            // Calculate salary
            int salary = calculateSalary(hours[i], rate);

            // Find category
            String category = getCategory(salary);

            // Display employee information
            System.out.println(
                names[i] + ": " + hours[i] +
                " hours, Rs " + salary + " " + category
            );

            validEmployees++;

            totalSalary = totalSalary + salary;
        }

        // Calculate average
        double averageSalary = (double) totalSalary / validEmployees;

        System.out.println("Valid employees: " + validEmployees);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + averageSalary);
    }
}
