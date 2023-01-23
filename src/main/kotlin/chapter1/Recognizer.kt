package chapter1

fun main() {
    val input = readln()


    val result = when (input[0]) {
        in '0'..'9' -> "It is digit"
        in 'a'..'z', in 'A'..'Z' -> "It is letter"
        else -> "Idk"
    }

    println(result)
}