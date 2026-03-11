# Use Case 10: Normalized Palindrome Validation

## Description
This is a lightweight Java application that validates whether a given string is a palindrome. It implements a normalization step prior to validation, ensuring that the palindrome check is based on the logical sequence of letters and numbers rather than being dependent on formatting, spaces, or punctuation.

## Features
* **Input Normalization**: Strips all spaces and special symbols from the input string using Regular Expressions (`[^a-zA-Z0-9]`).
* **Case-Insensitivity**: Converts all characters to lowercase to ensure `A` matches `a`.
* **Efficient Processing**: The validation loop compares characters from the outside in and exits immediately if a mismatch is found, saving processing time on longer strings.

## Example
If the input is:
`"A man a plan a canal Panama"`

The application evaluates the normalized version:
`"amanaplanacanalpanama"`

And returns a successful validation.

## Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your machine.

## How to Run

1. **Save the file**: Ensure the Java code is saved in a file named `UseCase10PalindromeCheckerApp.java`.
2. **Open your terminal or command prompt**.
3. **Navigate to the directory** where the file is saved.
4. **Compile the Java file**:
   ```bash
   javac UseCase10PalindromeCheckerApp.java
   