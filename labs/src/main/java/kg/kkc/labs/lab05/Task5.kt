package kg.kkc.labs.lab05

fun main() {
    print("Enter text: ")
    val line = readln()
    var count = 0
    for (ch in line) {
        if (ch.isLetter()) {
            count++
        }
    }
    println("Letters: $count")
}
