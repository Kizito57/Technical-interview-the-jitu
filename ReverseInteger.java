//  1.Design a function that reverses the digits of an integer. For example, 50 should become 5 and -12 should become -21.

import java.util.Scanner; // Imports the Scanner class for user input

public class ReverseInteger {

    // Method to reverse the digits of the integer
    public static int reverseDigits(int number) {
        boolean isNegative = number < 0; // Checks if the number is negative
        number = Math.abs(number); // Converts the number to its absolute value
        
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Builds the reversed number
            number /= 10; // Removes the last digit from the number
        }
        
        // If the original number was negative, return the negative of reversedNumber
        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to be reversed: ");
        int number = scanner.nextInt(); // Read the number entered by the user
        
        // Call the reverseDigits method to reverse the digits of the entered number
        int reversedNumber = reverseDigits(number);
        
        // Display the reversed number
        System.out.println("Reversed number is: " + reversedNumber);
        
        scanner.close(); // Close the Scanner object to free up resources
    }
}
