### Use Case 4 (UC4): Character Array Based Validation
* **Goal:** Validate a palindrome by converting the string into a character array and comparing characters using the two-pointer technique.
* **Key Concepts:** * `char[]` (Character Array): Storing individual characters for index-based access.
    * **Two-Pointer Technique:** Initializing one pointer at the start (index `0`) and one at the end (index `length - 1`), moving them towards the center.
    * **Efficiency & Complexity:** Highly optimized approach. It reduces extra memory usage since it doesn't create new `String` objects (unlike UC3) and stops early if a mismatch is found.
* **Data Structure:** `char[]`



---
UC4: Character Array Based Palindrome Check
## 💻 How to Compile and Run

To run the different use cases, open your terminal, navigate to the project directory, and use the following commands:

**For Use Case 2:**
```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp