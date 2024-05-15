import java.util.Scanner; 

public class RecursiveProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to get input from the user
        double[] numbers = new double[5]; // Array to store the numbers

        System.out.println("Enter five numbers:"); // Prompt the user to enter five numbers
        getNumbers(scanner, numbers, 0); // Method to get the numbers from the user

        double product = productOfNumbers(numbers, 0); // Method to calculate the product of the numbers
        System.out.println("The product of the numbers is: " + product); // Display the product of the numbers
    }

    // Method to recursively get the numbers from the user
    public static void getNumbers(Scanner scanner, double[] numbers, int index) {
        if (index == numbers.length) { // Base case
            return; // Return when all the numbers are entered
        } else { // Recursive case
            System.out.print("Enter number " + (index + 1) + ": "); // Prompt the user to enter a number
            numbers[index] = scanner.nextDouble(); // Store the number in the array
            getNumbers(scanner, numbers, index + 1); // Recursively call the method to get the next number
        }
    }

    // Method to recursively calculate the product of the numbers
    public static double productOfNumbers(double[] numbers, int index) {
        if (index == numbers.length) { // Base case
            return 1; // Return 1 when all the numbers are multiplied
        } else { // Recursive case
            return numbers[index] * productOfNumbers(numbers, index + 1); // Recursively call the method to multiply the next number
        }
    }
}
