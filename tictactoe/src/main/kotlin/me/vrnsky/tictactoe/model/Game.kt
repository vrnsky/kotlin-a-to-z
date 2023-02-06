package me.vrnsky.tictactoe.model

import me.vrnsky.tictactoe.io.ConsoleInput

class Game(val board: Board, val consoleInput: ConsoleInput) {

    val firstPlayerPerforming = true
    val secondPlayerPerforming = false
    fun start() {
        val firstPlayerName = consoleInput.askForString("Enter name of the first player")
        val firstPlayerSign = consoleInput.askForString("Enter sign of the first player X or O")

        val secondPlayerName = consoleInput.askForString("Enter name of the second player")
        val secondPlayerSign = if (firstPlayerSign == "X") "O" else "X"

        val firstPlayer = Player(firstPlayerName, firstPlayerSign)
        val secondPlayer = Player(secondPlayerName, secondPlayerSign)

        println("${firstPlayer.name} with sign ${firstPlayer.shape} vs ${secondPlayer.name} with sign ${secondPlayer.shape}")

        while(!isWinnerPresent()) {
        }
    }

    private fun isWinnerPresent(): Boolean {
        for (i in 0..3) {
            println("${i}-th iteration")
        }

        return false
    }

}