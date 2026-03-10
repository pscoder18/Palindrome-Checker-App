# Palindrome Checker App

## 📌 Project Objective
The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions. This project serves to strengthen core programming fundamentals, control flow logic, and understanding of data structure concepts in Java.

---

## 🚀 Use Cases Implemented

### Use Case 2 (UC2): Basic Palindrome Validation
* **Goal:** Determine if a string is a palindrome by comparing characters from both ends towards the center.
* **Key Concepts:** `Scanner` for user input, `for` loops (iterating to half the string length), `charAt()`, and conditional statements (`if-else`).
* **Efficiency:** Stops checking as soon as a mismatch is found, making it highly efficient.

### Use Case 3 (UC3): Palindrome Check Using String Reverse
* **Goal:** Check whether a string is a palindrome by completely reversing it and comparing it to the original.
* **Key Concepts:** Iterating in reverse order, String Immutability, String Concatenation (`+`), and the `.equals()` method for comparing object contents.
* **Focus:** Introduces transformation-based validation and highlights the behavior of immutable Strings in Java.

---

## 🛠️ Technologies Used
* **Language:** Java (JDK 8 or higher recommended)
* **IDE:** IntelliJ IDEA (or any standard text editor)
* **Version Control:** Git & GitHub

---

## 💻 How to Compile and Run

To run the different use cases, open your terminal, navigate to the project directory, and use the following commands:

**For Use Case 2:**
```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp