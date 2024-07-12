/*5. Design a function that takes a list of integers as input. The function should 
return True if the list contains two consecutive threes (3 next to a 3) anywhere 
within the list. Otherwise, it should return False. For example, the function 
should return True for [1, 3, 3] and False for [1, 3, 1, 3] */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveThrees {
    public static boolean hasConsecutiveThrees(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 3 && numbers.get(i + 1) == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers separated by spaces:");

        String input = scanner.nextLine();
        String[] inputNumbers = input.split("\\s+");

        for (String num : inputNumbers) {
            try {
                numbers.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
                return; // Exit if there's invalid input
            }
        }

        System.out.println("Result: " + hasConsecutiveThrees(numbers)); // Output: true/false
        scanner.close();
    }
}

