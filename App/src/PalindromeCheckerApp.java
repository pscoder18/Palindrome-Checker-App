import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; // 1. Import the Scanner class
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // 2. Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 3. Prompt the user to enter a word
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue at the back
            stack.push(c); // Push onto the top
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;


        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // queue.remove() gets the first character inserted (FIFO)
            // stack.pop() gets the last character inserted (LIFO)
            if (queue.remove() != stack.pop()) {
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