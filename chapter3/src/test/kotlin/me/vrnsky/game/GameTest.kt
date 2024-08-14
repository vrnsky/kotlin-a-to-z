package me.vrnsky.game

import me.vrnsky.io.TestIO
import me.vrnsky.io.TestInput
import me.vrnsky.io.TestOutput
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `Test if user enter correct word then game is stopped with proper message`() {
        val gameMessages = mutableListOf<String>()
        Game(
            TestIO(
                TestInput(listOf("jjjj", "jjjj", "test"), 0),
                TestOutput(gameMessages)
            ),
            false,
            3,
            "test",
            GameStatus.IN_PROGRESS
        )
            .startGame()

        Assertions.assertEquals("Congrats! You got it!", gameMessages[2])
    }

    @Test
    fun `Test if user enter wrong word and no more tries then game is stopped with proper message`() {
        val gameMessages = mutableListOf<String>()
        Game(
            TestIO(
                TestInput(listOf("jjjj", "jjjj", "asd"), 0),
                TestOutput(gameMessages)
            ),
            false,
            3,
            "test",
            GameStatus.IN_PROGRESS
        )
            .startGame()

        Assertions.assertEquals("Next time. The word is test", gameMessages[3])
    }
}