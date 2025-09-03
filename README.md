# JUnit Testing Lab

## Learning Objectives

* Master the fundamentals of unit testing with JUnit framework
* Implement method-driven solutions for mathematical and string processing problems
* Practice test-driven development by writing comprehensive test cases
* Develop skills in edge case identification and boundary testing
* Build confidence in code validation through automated testing

## Introduction

Unit testing is a crucial aspect of software development that ensures individual components of your code work correctly.
In this lab, you will implement five core methods that demonstrate fundamental programming concepts including arithmetic
operations, conditional logic, character analysis, mathematical algorithms, and string manipulation. Each method must be
thoroughly tested using the JUnit framework to validate functionality across various scenarios.

This hands-on approach will reinforce your understanding of method design while introducing you to professional testing
practices used in real-world software development.

## Requirements

Implement the following methods in Java and create comprehensive JUnit test suites for each:

### Method 1: Sum Calculator

**Method:** `getTotal(int a, int b)`

- **Purpose:** Calculate the sum of two integers
- **Parameters:** Two integer values
- **Return:** Integer sum of the inputs
- **Testing Focus:** Positive numbers, negative numbers, zero values, integer overflow scenarios

### Method 2: Even Number Checker

**Method:** `isEven(int number)`

- **Purpose:** Determine if an integer is even
- **Parameters:** Single integer value
- **Return:** `true` if even, `false` if odd
- **Testing Focus:** Positive/negative even numbers, positive/negative odd numbers, zero

### Method 3: Vowel Detection

**Method:** `isVowel(char character)`

- **Purpose:** Identify if a character is a vowel (a, e, i, o, u)
- **Parameters:** Single character
- **Return:** `true` if vowel, `false` otherwise
- **Additional Requirement:** Create a main method that accepts user input string and counts total vowels using this
  method
- **Testing Focus:** Uppercase/lowercase vowels, consonants, special characters, numbers

### Method 4: Prime Number Validator

**Method:** `isPrime(int number)`

- **Purpose:** Determine if a number is prime (divisible only by 1 and itself)
- **Parameters:** Single integer value
- **Return:** `true` if prime, `false` otherwise
- **Examples:** 5 is prime (divisors: 1, 5), 6 is not prime (divisors: 1, 2, 3, 6)
- **Testing Focus:** Known primes (2, 3, 5, 7, 11), composite numbers, edge cases (0, 1, negative numbers)

### Method 5: Palindrome Checker

**Method:** `isPalindrome(int number)`

- **Purpose:** Check if a nonnegative integer reads the same forwards and backwards
- **Parameters:** Nonnegative integer
- **Return:** `true` if palindrome, `false` otherwise
- **Examples:** 5, 121, 3443, 123454321 are palindromes
- **Testing Focus:** Single digits, multi-digit palindromes, non-palindromes, large numbers

### Bonus Method: Word Length Filter

**Method:** `filterLongWords(String[] words, int threshold)`

- **Purpose:** Extract words longer than specified character count
- **Parameters:** Array of strings, integer threshold
- **Return:** Array of strings containing only words exceeding the threshold length
- **Testing Focus:** Empty arrays, arrays with short/long words, boundary conditions

## Implementation Requirements

### Main Class Structure

```java
public class LabMethods {
    // Implement all required methods here

    public static void main(String[] args) {
        // Demonstrate each method with sample calls
        // Include user interaction for vowel counting exercise
    }
}
```

### JUnit Test Class Structure

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabMethodsTest {
    // Write comprehensive test methods for each implemented method
    // Include positive tests, negative tests, and edge cases
}
```

## Testing Guidelines

For each method, create test cases that cover:

- Happy Path Testing: Normal, expected inputs that should work correctly
- Edge Case Testing: Boundary values, minimum/maximum inputs, empty inputs
- Error Condition Testing: Invalid inputs, unexpected scenarios
- Comprehensive Coverage: Multiple test scenarios per method to ensure reliability

### Example Test Structure

```java
@Test
void testMethodName_ExpectedBehavior_Condition(){
    // Arrange: Set up test data
    // Act: Call the method being tested
    // Assert: Verify the expected outcome
}
```

## Additional Resources

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [JUnit 5 API Documentation](https://junit.org/junit5/docs/current/api/)
- [Oracle Java Testing Tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/tests.html)
- [Best Practices for Unit Testing](https://martinfowler.com/articles/practical-test-pyramid.html)
- [AssertJ Documentation](https://assertj.github.io/doc/) (Alternative assertion library)
- [Test-Driven Development Guide](https://martinfowler.com/bliki/TestDrivenDevelopment.html)