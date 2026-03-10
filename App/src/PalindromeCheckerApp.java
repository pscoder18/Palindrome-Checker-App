import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.addLast(c); // Or list.add(c), both append to the end
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove and compare elements from both ends
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }

        // Display the results matching the required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Close the scanner
        scanner.close();
    }
}