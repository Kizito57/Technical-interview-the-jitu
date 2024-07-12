/*4. Design a function that determines whether a given string is a pangram. A 
pangram is a sentence or phrase containing every letter of the alphabet at 
least once. Punctuation and case are typically ignored. For example, the 
string "The quick brown fox jumps over the lazy dog" is a pangram, while 
"Hello, world!" is not. */

import java.util.Scanner;

public class PangramChecker {

    // Function to check if a string is a pangram
    public static boolean isPangram(String sentence) {
        // Create a boolean array to mark the presence of each letter in the alphabet
        boolean[] alphabetPresent = new boolean[26];
        
        // Convert the sentence to lowercase to ignore case sensitivity
        String lowercaseSentence = sentence.toLowerCase();
        
        // Iterate through each character in the sentence
        for (int i = 0; i < lowercaseSentence.length(); i++) {
            char ch = lowercaseSentence.charAt(i);
            // Check if the character is a letter ('a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding index in alphabetPresent as true
                alphabetPresent[ch - 'a'] = true;
            }
        }
        
        // Check if all alphabets are present in the sentence
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence to check if it's a pangram: ");
        String sentence = scanner.nextLine();
        
        // Check if the sentence is a pangram and display the result
        boolean result = isPangram(sentence);
        if (result) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
        
        scanner.close(); // Close the Scanner object to free up resources
    }
}
