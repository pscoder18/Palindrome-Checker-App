public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // 1. Define the input string
        String input = "racecar";

        // 2. Instantiate the service class
        PalindromeService service = new PalindromeService();

        // 3. Call the method and store the result
        boolean isPalindrome = service.checkPalindrome(input);

        // 4. Print the output matching the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            // If the characters at the pointers don't match, it's not a palindrome
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            // Move pointers inward for the next iteration
            start++;
            end--;
        }

        // If the loop finishes without returning false, it is a palindrome
        return true;
    }
}