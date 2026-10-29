package kg.kkc.labs.lab02

fun main() {
    print("Enter total seconds: ")
    val totalSeconds = readln().toInt()
    val hours = totalSeconds / 3600
    val remainder = totalSeconds % 3600
    val minutes = remainder / 60
    val seconds = remainder % 60
    println("H:M:S -> $hours:$minutes:$seconds")
    println("$hours hour(s), $minutes minute(s), $seconds second(s)")
}
