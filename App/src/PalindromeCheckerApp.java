public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // 1. Define the input string
        String input = "level";

        // 2. Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        // 3. Execute the palindrome check (Using a fast two-pointer approach here)
        boolean isPalindrome = checkPalindrome(input);

        // 4. Capture execution end time
        long endTime = System.nanoTime();

        // 5. Calculate total execution duration
        long executionTime = endTime - startTime;

        // 6. Display benchmarking results matching the required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }


    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}