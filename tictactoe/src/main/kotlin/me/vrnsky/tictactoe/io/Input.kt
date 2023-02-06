package me.vrnsky.tictactoe.io

interface Input {
    fun print(message: String)

    fun askForInteger(message: String): Int

    fun askForString(message: String): String
}