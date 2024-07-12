/*6. Master Yoda, a renowned Jedi Master from the Star Wars universe, is known 
for his unique way of speaking. He often reverses the order of words in his 
sentences. For example, instead of saying "I am home" he might say "Home 
am I" Design a function that takes a sentence as input and returns a new 
sentence with the words reversed in the same order that Master Yoda would 
use */
import java.util.Scanner;

public class ReverseWords {

    // Function to reverse the order of words in a sentence
    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" "); // Add space between words
            }
        }
        
        return reversedSentence.toString(); // Return the reversed sentence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Get the reversed version of the sentence
        String reversedSentence = reverseSentence(sentence);
        
        // Display the result
        System.out.println("Reversed sentence: " + reversedSentence);
        
        scanner.close(); // Close the Scanner object to free up resources
    }
}
