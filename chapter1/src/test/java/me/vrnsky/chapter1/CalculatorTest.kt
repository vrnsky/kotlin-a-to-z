package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `Test that addition method from calculator works correctly`() {
        assertEquals(4, calculator.add(2, 2))
    }

    @Test
    fun `Test that subtraction method from calculator works correctly`() {
        assertEquals(0, calculator.subtract(2, 2))
    }

    @Test
    fun `Test that multiplication method from calculator works correctly`() {
        assertEquals(4, calculator.multiply(2, 2))
    }

    @Test
    fun `Test that division method throws exception when divisor is 0`() {
        assertThrows<IllegalArgumentException> {
            Calculator().divide(2, 0)
        }
    }

    @Test
    fun `Test that division method works correctly when divisor is not 0`() {
        assertEquals(2, calculator.divide(4, 2))
    }
}