package me.vrnsky.io.console

import me.vrnsky.io.IO
import me.vrnsky.io.Input
import me.vrnsky.io.Output

class ConsoleIO(val input: Input, val output: Output) : IO {

    override fun askUser(msg: String): String {
        return input.askUser(msg)
    }

    override fun messageUser(msg: String) {
        output.messageUser(msg)
    }
}