package kg.kkc.labs.lab02

fun main() {
    val small: Byte = 100
    // If we change small to 200, compilation fails because 200 exceeds Byte.MAX_VALUE (127).
    val medium: Short = 20_000

    val sum = small + medium
    println("Sum: $sum")
    println("Type of sum: Int (arithmetic on Byte/Short promotes to Int)")
}
