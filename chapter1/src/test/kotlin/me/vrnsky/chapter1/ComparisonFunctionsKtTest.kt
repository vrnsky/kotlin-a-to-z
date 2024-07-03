package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ComparisonFunctionsKtTest {

    @Test
    fun `Test comparison function greater works correctly`() {
        Assertions.assertEquals(true, greater(10, 0))
        Assertions.assertEquals(false, greater(0, 10))
    }

    @Test
    fun `Test comparison function less works correctly`() {
        Assertions.assertEquals(true, less(0, 5))
        Assertions.assertEquals(false, less(5, 0))
    }


    @Test
    fun `Test comparison function lessOrEquals works correctly`() {
        Assertions.assertEquals(true, lessOrEqual(5, 5))
    }

    @Test
    fun `Test comparison function greaterOrEquals works correctly`() {
        Assertions.assertEquals(true, greaterOrEqual(6, 5))
    }

}