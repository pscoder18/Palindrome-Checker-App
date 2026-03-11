# Use Case 11: Object-Oriented Palindrome Service

## Description
This Java application demonstrates how to validate a palindrome using Object-Oriented Programming (OOP) principles. Instead of placing all the logic inside the `main` method, the palindrome-checking algorithm is encapsulated within a dedicated `PalindromeService` class.

This architectural choice improves the code's reusability, readability, and separation of concerns, making it easier to maintain and scale.

## Features
* **Object-Oriented Design**: Utilizes a service class (`PalindromeService`) to handle the core business logic.
* **Two-Pointer Algorithm**: Employs a highly efficient `while` loop with two pointers (start and end) that move inward, comparing characters until they meet in the middle.
* **Separation of Concerns**: The main application class is only responsible for managing the input/output and instantiating the service, keeping the code clean.

## Example
**Input:**
`racecar`

**Output:**
```text
Input : racecar
Is Palindrome? : true