package kg.kkc.labs.lab05

fun main() {
    print("Enter text: ")
    val line = readln()
    var result = ""
    for (ch in line) {
        if (ch.isLetter()) {
            result += ch
        }
    }
    println(result)
}
