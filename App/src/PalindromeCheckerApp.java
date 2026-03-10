import java.util.Scanner;


public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Initialize an empty string to hold our reversed version
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // Build the reversed string character by character
            reversed += input.charAt(i);
        }

        // Compare the actual content of the two String objects using equals()
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}