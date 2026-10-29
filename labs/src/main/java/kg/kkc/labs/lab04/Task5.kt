package kg.kkc.labs.lab04

fun main() {
    val xs = listOf(2, 1, 7, 4)

    // Version A
    var sumA = 0
    for (x in xs) {
        sumA += x
    }

    // Version B
    var sumB = 0
    for (i in 0 until xs.size) {
        sumB += xs[i]
    }

    println("Sum A: $sumA")
    println("Sum B: $sumB")
}
