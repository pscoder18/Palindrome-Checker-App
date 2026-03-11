/**
 * =================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // 1. Define the input string (using the example from the documentation)
        String input = "A man a plan a canal Panama";

        // 2. Normalize the string
        // replaceAll("[^a-zA-Z0-9]", "") removes all spaces and punctuation symbols.
        // toLowerCase() ensures case-insensitivity.
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Flag to track if the string is a palindrome
        boolean isPalindrome = true;

        // 3. Compare characters from both ends (using the provided hint)
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                // If any characters don't match, it's not a palindrome
                isPalindrome = false;
                break; // Exit the loop early to save processing time
            }
        }

        // 4. Output the results
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Normalized String: \"" + normalized + "\"");

        if (isPalindrome) {
            System.out.println("Result: Valid Palindrome.");
        } else {
            System.out.println("Result: Invalid Palindrome.");
        }
    }
}