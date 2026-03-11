# Use Case 12: Strategy Pattern for Palindrome Algorithms

## Description
This Java application demonstrates the **Strategy Design Pattern** by allowing different palindrome validation algorithms to be selected dynamically at runtime.

Instead of hardcoding a single validation method, the application defines a common `PalindromeStrategy` interface. This allows for excellent extensibility—new algorithms can be added simply by creating new classes that implement this interface, without altering the core application logic.



Currently, the application includes a `StackStrategy` which utilizes a Last-In-First-Out (LIFO) data structure to reverse and validate the string.

## Features
* **Strategy Design Pattern**: Decouples the algorithmic logic from the main application, promoting the Open/Closed Principle (open for extension, closed for modification).
* **Interface-Driven Design**: Uses a `PalindromeStrategy` interface as a contract for all validation algorithms.
* **Stack-Based Validation**: The `StackStrategy` pushes characters onto a `java.util.Stack` and pops them off to seamlessly compare the string against its reversed self.

## Example
**Input:**
`racecar`

**Output:**
```text
Input : racecar
Is Palindrome? : true