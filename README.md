### Use Case 7 (UC7): Deque Based Optimized Palindrome Checker
* **Goal:** Validate a palindrome using a Deque (Double-Ended Queue) for an efficient front-to-back comparison.
* **Key Concepts:** * **Deque Data Structure:** A double-ended queue that allows elements to be added or removed from *both* the front and the back.
    * **Bidirectional Traversal:** Using `removeFirst()` and `removeLast()` to simultaneously pull and compare characters from opposite ends of the word.
    * **Optimization:** This approach provides the symmetric comparison benefits of combining a Queue and Stack (like in UC6), but does so using only a single, highly efficient data structure.
* **Data Structure:** `Deque` (implemented using `ArrayDeque`)



---

## 💻 How to Compile and Run

To run the different use cases, open your terminal, navigate to the project directory, and use the following commands:

**For Use Case 2:**
```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp

