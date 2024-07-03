package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CollectionFunctionsKtTest {

    @Test
    fun `Test that collection function sum works correctly`() {
        Assertions.assertEquals(6, sum(listOf(1, 2, 3)))
    }

    @Test
    fun `Test that collection function max works correctly`() {
        Assertions.assertEquals(5, max(listOf(1, 2, 3, 4, 5)))
    }
}