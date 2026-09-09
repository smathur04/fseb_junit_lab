import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabMethodsTest {

    // -------------------- getTotal --------------------

    @Test
    void testGetTotal_ReturnsCorrectSum_PositiveNumbers() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = LabMethods.getTotal(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    void testGetTotal_ReturnsCorrectSum_NegativeNumbers() {
        // Arrange
        int a = -5;
        int b = -3;

        // Act
        int result = LabMethods.getTotal(a, b);

        // Assert
        assertEquals(-8, result);
    }

    @Test
    void testGetTotal_ReturnsZero_OppositeNumbers() {
        // Arrange
        int a = -5;
        int b = 5;

        // Act
        int result = LabMethods.getTotal(a, b);

        // Assert
        assertEquals(0, result);
    }


    // -------------------- isEven --------------------

    @Test
    void testIsEven_ReturnsTrue_EvenNumber() {
        // Arrange
        int number = 10;

        // Act
        boolean result = LabMethods.isEven(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsEven_ReturnsFalse_OddNumber() {
        // Arrange
        int number = 7;

        // Act
        boolean result = LabMethods.isEven(number);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsEven_ReturnsTrue_Zero() {
        // Arrange
        int number = 0;

        // Act
        boolean result = LabMethods.isEven(number);

        // Assert
        assertTrue(result);
    }


    // -------------------- isVowel --------------------

    @Test
    void testIsVowel_ReturnsTrue_LowercaseVowel() {
        // Arrange
        char character = 'a';

        // Act
        boolean result = LabMethods.isVowel(character);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsVowel_ReturnsTrue_UppercaseVowel() {
        // Arrange
        char character = 'E';

        // Act
        boolean result = LabMethods.isVowel(character);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsVowel_ReturnsFalse_Consonant() {
        // Arrange
        char character = 'z';

        // Act
        boolean result = LabMethods.isVowel(character);

        // Assert
        assertFalse(result);
    }


    // -------------------- isPrime --------------------

    @Test
    void testIsPrime_ReturnsTrue_PrimeNumber() {
        // Arrange
        int number = 13;

        // Act
        boolean result = LabMethods.isPrime(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrime_ReturnsFalse_CompositeNumber() {
        // Arrange
        int number = 12;

        // Act
        boolean result = LabMethods.isPrime(number);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPrime_ReturnsTrue_SmallestPrime() {
        // Arrange
        int number = 2;

        // Act
        boolean result = LabMethods.isPrime(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPrime_ReturnsFalse_NumberLessThanTwo() {
        // Arrange
        int number = 1;

        // Act
        boolean result = LabMethods.isPrime(number);

        // Assert
        assertFalse(result);
    }


    // -------------------- isPalindrome --------------------

    @Test
    void testIsPalindrome_ReturnsTrue_PalindromeNumber() {
        // Arrange
        int number = 121;

        // Act
        boolean result = LabMethods.isPalindrome(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPalindrome_ReturnsFalse_NonPalindromeNumber() {
        // Arrange
        int number = 123;

        // Act
        boolean result = LabMethods.isPalindrome(number);

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsPalindrome_ReturnsTrue_SingleDigitNumber() {
        // Arrange
        int number = 7;

        // Act
        boolean result = LabMethods.isPalindrome(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPalindrome_ReturnsFalse_NegativeNumber() {
        // Arrange
        int number = -121;

        // Act
        boolean result = LabMethods.isPalindrome(number);

        // Assert
        assertFalse(result);
    }
}