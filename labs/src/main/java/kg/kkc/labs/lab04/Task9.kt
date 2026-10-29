package kg.kkc.labs.lab04

fun main() {
    print("Enter numbers separated by spaces: ")
    val line = readln()
    val parts = line.split(" ")
    var sum = 0
    for (part in parts) {
        if (part.isNotBlank()) {
            sum += part.toInt()
        }
    }
    println("Sum = $sum")
}
