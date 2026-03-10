### Use Case 8 (UC8): Linked List Based Palindrome Checker
* **Goal:** Validate a palindrome by leveraging the double-ended operations of a LinkedList.
* **Key Concepts:** * **LinkedList:** In Java, this is implemented as a doubly linked list, meaning each element holds a reference to both the previous and next elements.
    * **Double-ended Operations:** Utilizing `removeFirst()` and `removeLast()` to pull elements from the front and back of the list simultaneously.
    * **Symmetric Validation:** Comparing elements from both ends inward until the list has one or zero elements remaining, proving the string reads the same forwards and backwards.
* **Data Structure:** `LinkedList`



---

## 💻 How to Compile and Run

To run the different use cases, open your terminal, navigate to the project directory, and use the following commands:

**For Use Case 2:**
```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp