package me.vrnsky.tictactoe.io

class ConsoleInput : Input {
    override fun print(message: String) {
        println(message)
    }

    override fun askForInteger(message: String): Int {
        println(message)
        return readln().toInt()
    }

    override fun askForString(message: String): String {
        print(message)
        return readln()
    }
}