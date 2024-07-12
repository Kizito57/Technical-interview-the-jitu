/*3. Design a function that takes a string or sequence of characters as input and 
returns the character that appears most frequently.
//Eg 11189 => '1'
//hello => l */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    // Function to find the character that appears most frequently in a string
    public static char mostFrequentChar(String input) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the character with the maximum count
        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        
        // Prompt the user to enter a string
        System.out.print("Enter a set of characters/string: ");
        String input = scanner.nextLine();
        
        // Find the most frequent character and display the result
        char result = mostFrequentChar(input);
        System.out.println("The most frequent character is: " + result);
        
        scanner.close(); // Close the Scanner object to free up resources
    }
}
