### Use Case 9 (UC9): Recursive Palindrome Checker
* **Goal:** Validate a palindrome using recursive method calls instead of traditional loops.
* **Key Concepts:** * **Recursion:** A programming technique where a method calls itself to solve smaller instances of the same problem.
    * **Base Condition:** The stopping criteria required to prevent infinite loops (which cause a `StackOverflowError`). In this case, recursion stops when a mismatch is found or when the pointers cross (`start >= end`).
    * **Divide-and-Conquer:** Breaking the problem down by comparing the outermost characters and recursively calling the method on the remaining inner substring.
* **Approach:** Recursive Method Logic

[Image of recursion call stack for palindrome checking]

---

## 💻 How to Compile and Run

To run the different use cases, open your terminal, navigate to the project directory, and use the following commands:

**For Use Case 2:**
```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp
