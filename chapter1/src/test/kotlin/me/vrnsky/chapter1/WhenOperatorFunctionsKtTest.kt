package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WhenOperatorFunctionsKtTest {

    @Test
    fun `Test choose method works correctly with different dayTime`() {
        Assertions.assertEquals("coffee", choose("morning"))
        Assertions.assertEquals("soup", choose("lunch"))
        Assertions.assertEquals("pasta", choose("dinner"))
        Assertions.assertEquals("do not eat", choose("do not eat"))
    }
}