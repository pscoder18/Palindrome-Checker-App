import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner; // 1. Import the Scanner class


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // 2. Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 3. Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare elements from both ends simultaneously
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }

        // Display the results matching the required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // 4. Close the scanner
        scanner.close();
    }
}