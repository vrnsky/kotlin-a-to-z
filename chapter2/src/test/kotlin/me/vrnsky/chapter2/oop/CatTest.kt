package me.vrnsky.chapter2.oop

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CatTest {

    @Test
    fun `Test that cat's speak method works correctly`() {
        val cat: Animal = Cat()
        Assertions.assertEquals("Meow", cat.speak())
    }
}