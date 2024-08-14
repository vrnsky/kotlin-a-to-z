package me.vrnsky.game

import me.vrnsky.io.IO

class Game(val io: IO, var isGameFinished: Boolean = false, var tries: Int = 3, val word: String, var gameStatus: GameStatus) {
    fun startGame() {
        println("Starting game")
        while(!isGameFinished) {
            val guessedWord = io.askUser("Enter a word: ")
            if (guessedWord == word) {
                isGameFinished = true
                gameStatus = GameStatus.WON
            } else if (tries > 0) {
                io.messageUser("Try one more time!")
                tries--
            }
            if (tries == 0) {
                gameStatus = GameStatus.LOST
                isGameFinished = true
            }
        }

        if (gameStatus == GameStatus.WON) {
            io.messageUser("Congrats! You got it!")
        } else {
            io.messageUser("Next time. The word is $word")
        }
    }
}