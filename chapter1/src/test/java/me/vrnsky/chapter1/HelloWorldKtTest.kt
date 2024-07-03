package me.vrnsky.chapter1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets

class HelloWorldKtTest {

    @Test
    fun `Test hello world output`() {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        main()

        Assertions.assertEquals("Hello World!\n", outputStream.toString(StandardCharsets.UTF_8.name()))
    }
}