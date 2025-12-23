package com.hendisantika.usermanagement.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    // Cas normaux
    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    // Cas limites
    @Test
    void testAddWithZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    // Exceptions
    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
