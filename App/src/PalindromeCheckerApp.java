import java.util.Scanner;
// 1. Import the Scanner class

/**
 * ==============================================================
 * MAIN CLASS - PalindromeCheckerApp (User Input Version)
 * ==============================================================
 * * Description:
 * This class demonstrates basic palindrome validation
 * using dynamic input from the user.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // 2. Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 3. Prompt the user to enter a string
        System.out.print("Enter a word to check if it's a palindrome: ");

        // 4. Read the user's input and store it in the 'input' variable
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Loop only till half of the string length.
        for (int i = 0; i < input.length() / 2; i++) {
            // Check if the character at the current index matches the character at the mirror index from the end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false; // Mismatch found, not a palindrome
                break; // Exit the loop early
            }
        }

        // Determine and display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        // 5. Close the scanner to prevent resource leaks
        scanner.close();
    }
}