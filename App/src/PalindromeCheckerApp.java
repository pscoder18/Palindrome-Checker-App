import java.util.Scanner; // 1. Import the Scanner class
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // 2. Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 3. Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        //
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string and pop from stack
        // Since stacks are Last-In-First-Out (LIFO), popping gives us the string in reverse
        //
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
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