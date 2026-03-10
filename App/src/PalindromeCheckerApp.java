import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Handle edge case for empty strings, otherwise start recursion
        boolean isPalindrome = true;
        if (input != null && !input.isEmpty()) {
            // Start checking from the first index (0) and the last index (length - 1)
            isPalindrome = check(input, 0, input.length() - 1);
        }

        // Display the results matching the required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Close the scanner
        scanner.close();
    }

    private static boolean check(String s, int start, int end) {

        // Base Condition 1: If pointers cross or meet, all pairs matched perfectly!
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If the current outer characters don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Shrink the problem by moving both pointers inward and calling the method again
        return check(s, start + 1, end - 1);
    }
}