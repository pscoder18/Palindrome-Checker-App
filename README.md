# Use Case 13: Performance Comparison

## Description
This Java application introduces benchmarking concepts by measuring the execution performance of a palindrome validation algorithm.

To achieve high-precision time tracking, the application utilizes Java's `System.nanoTime()` method. This allows developers to capture the exact start and end times of the algorithm's execution down to the nanosecond, providing a clear metric for evaluating algorithmic efficiency and performance.

## Features
* **Micro-Benchmarking**: Measures the precise execution duration of a specific block of code.
* **High-Resolution Timing**: Uses `System.nanoTime()` instead of `System.currentTimeMillis()` to capture ultra-precise performance metrics (1 millisecond = 1,000,000 nanoseconds).
* **Efficient Execution**: Implements a fast two-pointer algorithm to serve as the baseline strategy being measured.

## Example
**Input:**
`level`

**Expected Output:**
*(Note: The exact execution time will vary depending on the hardware and background processes running at the time of execution).*
```text
Input : level
Is Palindrome? : true
Execution Time : 852600 ns