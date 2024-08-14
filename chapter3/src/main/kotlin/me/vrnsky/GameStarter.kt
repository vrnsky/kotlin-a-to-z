package me.vrnsky

import me.vrnsky.game.Game
import me.vrnsky.game.GameStatus
import me.vrnsky.io.console.ConsoleIO
import me.vrnsky.io.console.ConsoleInput
import me.vrnsky.io.console.ConsoleOutput

fun main() {
    Game(ConsoleIO(ConsoleInput(), ConsoleOutput()), false, 3, "test", GameStatus.IN_PROGRESS).startGame()
}