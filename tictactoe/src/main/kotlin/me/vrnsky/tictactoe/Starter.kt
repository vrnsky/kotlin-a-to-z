package me.vrnsky.tictactoe

import me.vrnsky.tictactoe.io.ConsoleInput
import me.vrnsky.tictactoe.model.Board
import me.vrnsky.tictactoe.model.Game

fun main(args: Array<String>) {


    val board = Board(
        arrayOf(
            arrayOf("-", "-", "-"),
            arrayOf("-", "-", "-"),
            arrayOf("-", "-", "-"),
        )
    )

    Game(board, ConsoleInput()).start()
}