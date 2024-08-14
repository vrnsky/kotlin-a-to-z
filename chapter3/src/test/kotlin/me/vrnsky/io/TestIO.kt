package me.vrnsky.io

class TestIO(val input: TestInput, val output: TestOutput): IO {

    override fun askUser(msg: String): String {
        return input.askUser(msg)
    }

    override fun messageUser(msg: String) {
        return output.messageUser(msg)
    }
}