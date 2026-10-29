package kg.kkc.labs.lab02

fun main() {
    print("Enter a: ")
    val a = readln().toInt()
    print("Enter b: ")
    val b = readln().toInt()
    println("quotient = ${a / b}")
    println("remainder = ${a % b}")
    println("exact = ${a.toDouble() / b}")
}
