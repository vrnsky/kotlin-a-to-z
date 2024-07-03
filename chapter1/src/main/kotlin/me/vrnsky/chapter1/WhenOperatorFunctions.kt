package me.vrnsky.chapter1

fun choose(dayTime: String): String {
    return when (dayTime) {
        "morning" -> "coffee"
        "lunch" -> "soup"
        "dinner" -> "pasta"
        else -> "do not eat"
    }
}