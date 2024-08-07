package me.vrnsky.chapter2.oop

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PenguinTest {

    @Test
    fun `Test that penguin cannot speak`() {
        val animal = Penguin()
        Assertions.assertThrows(UnsupportedOperationException::class.java) { animal.speak() };
    }
}