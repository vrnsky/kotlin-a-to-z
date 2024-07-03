package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SoftwareEngineerTest {

    @Test
    fun `Test that software engineer greeting method works correctly`() {
        val engineer = SoftwareEngineer("Egor", "GitHub")
        Assertions.assertEquals(
            "Hello! My name is Egor! I'm working at GitHub",
            engineer.greeting()
        )
        engineer.company = "JetBrains"
        Assertions.assertEquals(
            "Hello! My name is Egor! I'm working at JetBrains",
            engineer.greeting()
        )
    }
}