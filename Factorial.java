//2. Write a recursive function to calculate the factorial of a number

import java.util.Scanner;

public class Factorial {

    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt(); // Read the number entered by the user
        
        int result = factorial(number); // Call the factorial method
        
        // Display the result
        System.out.println("Factorial of " + number + " is: " + result);
        
        scanner.close(); // Close the Scanner object to free up resources
    }
}
