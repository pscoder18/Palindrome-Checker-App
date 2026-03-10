import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            // If characters at the pointers don't match, it's not a palindrome
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit the loop early for efficiency
            }
            // Move the pointers towards the center
            start++;
            end--;
        }

        // Display the results matching the required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Close the scanner
        scanner.close();
    }
}